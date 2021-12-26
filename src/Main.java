import abstractFactoryPattern.ILineBreak;
import abstractFactoryPattern.LineBreakImpl;
import abstractFactoryPattern.LineBreakProxy;
import abstractFactoryPattern.adapter.LinuxLineBreakAdapter;
import abstractFactoryPattern.adapter.MacLineBreakAdapter;
import builderPattern.AssembleBuilder;
import factoryPattern.IProduce;
import factoryPattern.StoreFactory;
import prototypePattern.QuestionBankController;
import singletonPattern.DoubleLockCheck;
import singletonPattern.EnumerateSingletonPatterns;
import util.Utils;

import java.util.HashMap;

/**
 * @author thbelief
 * @date 2021/12/25 11:45 AM
 * @info
 */
public class Main {
    public static void main(String[] args) {
//        testFactoryPattern();
//        testAbstractFactoryPattern();
//        testBuilderPattern();
//        try {
//            testPrototypePattern();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
        testSingletonPatterns();
    }

    /**
     * 测试工厂模式
     */
    private static void testFactoryPattern() {
        Utils.logInfo("testFactoryPattern\n");
        StoreFactory storeFactory = new StoreFactory();
        IProduce iProduce = storeFactory.getProduceService(StoreFactory.TYPE_COMPUTER);
        final int userId = 10086;
        iProduce.produce(userId, new HashMap<>());
        iProduce = storeFactory.getProduceService(StoreFactory.TYPE_TELEVISION);
        iProduce.produce(userId, new HashMap<>());
        iProduce = storeFactory.getProduceService(StoreFactory.TYPE_PHONE);
        iProduce.produce(userId, new HashMap<>());
    }

    /**
     * 测试抽象工厂模式
     */
    private static void testAbstractFactoryPattern() {
        Utils.logInfo("testAbstractFactoryPattern\n");
        try {
            ILineBreak lineBreak = LineBreakProxy.getProxy(LineBreakImpl.class, new LinuxLineBreakAdapter());
            lineBreak.printLineBreak();
            lineBreak = LineBreakProxy.getProxy(LineBreakImpl.class, new MacLineBreakAdapter());
            lineBreak.printLineBreak();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 测试建造者模式
     */
    private static void testBuilderPattern() {
        Utils.logInfo("testBuilderPattern\n");
        AssembleBuilder builder = new AssembleBuilder();
        Utils.logInfo(builder.levelLow().getInfos());
        Utils.logInfo(builder.levelMid().getInfos());
        Utils.logInfo(builder.levelTop().getInfos());
    }

    /**
     * 测试原型模式
     */
    private static void testPrototypePattern() throws CloneNotSupportedException {
        Utils.logInfo("testPrototypePattern\n");
        QuestionBankController controller = new QuestionBankController();
        Utils.logInfo(controller.createPaper("小红", "123"));
        Utils.logInfo(controller.createPaper("小蓝", "456"));
        Utils.logInfo(controller.createPaper("小绿", "789"));
    }

    /**
     * 测试单例模式
     */
    private static void testSingletonPatterns() {
        Utils.logInfo("testSingletonPatterns\n");
        DoubleLockCheck.getInstance().printInfo();
        EnumerateSingletonPatterns.mInstance.print();
    }
}
