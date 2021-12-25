package factoryPattern.produce;

import factoryPattern.IProduce;
import util.Utils;

import java.util.Map;

/**
 * @author thbelief
 * @date 2021/12/25 11:24 AM
 * @info 生产手机
 */
public class PhoneProduce implements IProduce {
    @Override
    public void produce(int userId, Map<String, String> extraInfo) {
        Utils.logInfo(getClass().getSimpleName() + " " + userId + " " + extraInfo + " ");
    }
}
