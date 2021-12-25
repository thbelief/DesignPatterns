package abstractFactoryPattern.lineBreak;

import util.Utils;

/**
 * @author thbelief
 * @date 2021/12/25 9:38 PM
 * @info 需要适配的新增的Linux换行
 */
public class LinuxLineBreak {
    // 方法名那些都不一样
    public String getLinuxName() {
        return getClass().getSimpleName();
    }

    public void printInfo() {
        Utils.logInfo(getLinuxName());
    }
}
