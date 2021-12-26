package singletonPattern;

/**
 * @author thbelief
 * @date 2021/12/26 6:24 PM
 * @info   饱汉模式 线程安全 非懒加载
 */
public class FullHanMode implements IPrintInfo{
    private static FullHanMode mInstance = new FullHanMode();

    private FullHanMode() {

    }

    public static FullHanMode getInstance() {
        return mInstance;
    }
}
