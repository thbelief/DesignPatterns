package abstractFactoryPattern;

import abstractFactoryPattern.lineBreak.WindowsLineBreak;

/**
 * @author thbelief
 * @date 2021/12/25 9:31 PM
 * @info 原来的实现 要做的是对于MAC & LINUX做出适配
 */
public class LineBreakImpl implements ILineBreak {
    public WindowsLineBreak mWindowsLineBreak = new WindowsLineBreak();

    @Override
    public String getCurName() {
        return mWindowsLineBreak.getCurName();
    }

    @Override
    public void printLineBreak() {
        mWindowsLineBreak.printLineBreak();
    }
}
