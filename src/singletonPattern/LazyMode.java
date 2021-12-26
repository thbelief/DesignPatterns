package singletonPattern;

/**
 * @author thbelief
 * @date 2021/12/26 6:19 PM
 * @info 懒汉模式 非线程安全
 */
public class LazyMode implements IPrintInfo {
    private static LazyMode mInstance;

    private LazyMode() {

    }

    public static LazyMode getInstance() {
        if (mInstance != null) {
            return mInstance;
        }
        mInstance = new LazyMode();
        return mInstance;
    }
}
