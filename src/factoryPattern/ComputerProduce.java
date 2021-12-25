package factoryPattern;

import util.Utils;

import java.util.Map;

/**
 * @author thbelief
 * @date 2021/12/25 11:16 AM
 * @info
 */
public class ComputerProduce implements IProduce {

    @Override
    public void produce(int userId, Map<String, String> extraInfo) {
        Utils.logInfo(getClass().getSimpleName() + " " + userId + " " + extraInfo + " ");
    }
}
