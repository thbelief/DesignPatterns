package singletonPattern;

/**
 * @author thbelief
 * @date 2021/12/26 6:25 PM
 * @info 双重锁校验 线程安全 懒加载
 */
public class DoubleLockCheck implements IPrintInfo{
    private static volatile DoubleLockCheck mInstance;

    private DoubleLockCheck() {

    }

    public static DoubleLockCheck getInstance() {
        if (mInstance != null) {
            return mInstance;
        }
        synchronized (DoubleLockCheck.class) {
            if (mInstance == null) {
                mInstance = new DoubleLockCheck();
            }
        }
        return mInstance;
    }
}
