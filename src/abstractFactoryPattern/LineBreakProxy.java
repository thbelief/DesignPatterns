package abstractFactoryPattern;

import java.lang.reflect.Proxy;

/**
 * @author thbelief
 * @date 2021/12/25 9:46 PM
 * @info
 */
public class LineBreakProxy {
    public static <T> T getProxy(Class<T> interfaceClass, ILineBreakAdapter iLineBreakAdapter) throws Exception {
        LineBreakInvocationHandler invocationHandler = new LineBreakInvocationHandler(iLineBreakAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, invocationHandler);
    }
}
