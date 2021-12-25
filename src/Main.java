import factoryPattern.IProduce;
import factoryPattern.StoreFactory;

import java.util.HashMap;

/**
 * @author thbelief
 * @date 2021/12/25 11:45 AM
 * @info
 */
public class Main {
    public static void main(String[] args) {
        testFactoryPattern();
    }

    /*
     * 测试工厂模式
     * */
    private static void testFactoryPattern() {
        StoreFactory storeFactory = new StoreFactory();
        IProduce iProduce = storeFactory.getProduceService(StoreFactory.TYPE_COMPUTER);
        final int userId = 10086;
        iProduce.produce(userId, new HashMap<>());
        iProduce = storeFactory.getProduceService(StoreFactory.TYPE_TELEVISION);
        iProduce.produce(userId, new HashMap<>());
        iProduce = storeFactory.getProduceService(StoreFactory.TYPE_PHONE);
        iProduce.produce(userId, new HashMap<>());
    }
}
