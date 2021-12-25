package abstractFactoryPattern;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author thbelief
 * @date 2021/12/25 9:51 PM
 * @info
 */
public class LineBreakInvocationHandler implements InvocationHandler {
    ILineBreakAdapter mILineBreakAdapter;

    public LineBreakInvocationHandler(ILineBreakAdapter adapter) {
        this.mILineBreakAdapter = adapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ILineBreakAdapter.class.getMethod(method.getName(), null).invoke(mILineBreakAdapter, null);
    }
}
