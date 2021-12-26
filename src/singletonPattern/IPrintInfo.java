package singletonPattern;

import util.Utils;

/**
 * @author thbelief
 * @date 2021/12/26 6:30 PM
 * @info
 */
public interface IPrintInfo {
    default void printInfo() {
        Utils.logInfo(getClass().getSimpleName());
    }
}
