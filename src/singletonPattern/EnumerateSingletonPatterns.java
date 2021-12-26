package singletonPattern;

import util.Utils;

/**
 * @author thbelief
 * @date 2021/12/26 6:28 PM
 * @info 线程安全
 */
public enum EnumerateSingletonPatterns implements IPrintInfo{
    mInstance;

    public void print() {
        Utils.logInfo(getClass().getSimpleName());
    }
}
