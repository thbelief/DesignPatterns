package abstractFactoryPattern.adapter;

import abstractFactoryPattern.ILineBreakAdapter;
import abstractFactoryPattern.lineBreak.LinuxLineBreak;

/**
 * @author thbelief
 * @date 2021/12/25 9:45 PM
 * @info
 */
public class LinuxLineBreakAdapter implements ILineBreakAdapter {
    LinuxLineBreak mLinuxLineBreak = new LinuxLineBreak();

    @Override
    public String getCurName() {
        return mLinuxLineBreak.getLinuxName();
    }

    @Override
    public void printLineBreak() {
        mLinuxLineBreak.printInfo();
    }
}
