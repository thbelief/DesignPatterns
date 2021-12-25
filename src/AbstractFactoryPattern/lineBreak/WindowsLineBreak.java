package AbstractFactoryPattern.lineBreak;

import util.Utils;

/**
 * @author thbelief
 * @date 2021/12/25 9:33 PM
 * @info 原来使用的Windows换行
 */
public class WindowsLineBreak {
    public String getCurName() {
        return getClass().getSimpleName();
    }

    public void printLineBreak() {
        Utils.logInfo(getCurName());
    }
}
