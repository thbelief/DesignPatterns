package abstractFactoryPattern.lineBreak;

import util.Utils;

/**
 * @author thbelief
 * @date 2021/12/25 9:37 PM
 * @info 需要适配的新增mac换行
 */
public class MacLineBreak {
    // 方法名那些都不一样
    public String getMacName() {
        return getClass().getSimpleName();
    }

    public void printSomeThing() {
        Utils.logInfo(getMacName());
    }
}
