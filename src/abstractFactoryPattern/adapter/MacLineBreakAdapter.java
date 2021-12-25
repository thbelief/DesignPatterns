package abstractFactoryPattern.adapter;

import abstractFactoryPattern.ILineBreakAdapter;
import abstractFactoryPattern.lineBreak.MacLineBreak;

/**
 * @author thbelief
 * @date 2021/12/25 9:41 PM
 * @info
 */
public class MacLineBreakAdapter implements ILineBreakAdapter {
    MacLineBreak mMacLineBreak = new MacLineBreak();

    @Override
    public String getCurName() {
        return mMacLineBreak.getMacName();
    }

    @Override
    public void printLineBreak() {
        mMacLineBreak.printSomeThing();
    }
}
