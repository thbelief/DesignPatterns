package factoryPattern;

import util.Utils;

/**
 * @author thbelief
 * @date 2021/12/25 11:25 AM
 * @info
 */
public class StoreFactory {
    public static final String TYPE_COMPUTER = "computer";
    public static final String TYPE_TELEVISION = "television";
    public static final String TYPE_PHONE = "phone";

    public IProduce getProduceService(String type) {
        switch (type) {
            case TYPE_COMPUTER:
                return new ComputerProduce();
            case TYPE_TELEVISION:
                return new TelevisionProduce();
            case TYPE_PHONE:
                return new PhoneProduce();
            default:
                break;
        }
        Utils.logInfo("not found this type");
        return null;
    }
}
