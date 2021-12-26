package singletonPattern;

/**
 * @author thbelief
 * @date 2021/12/26 6:21 PM
 * @info 懒汉模式 线程安全
 */
public class LazyModeThreadSafety implements IPrintInfo {
    private static LazyModeThreadSafety mInstance;

    private LazyModeThreadSafety() {

    }

    public static synchronized LazyModeThreadSafety getInstance() {
        if (mInstance != null) {
            return mInstance;
        }
        mInstance = new LazyModeThreadSafety();
        return mInstance;
    }
}
