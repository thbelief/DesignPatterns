package factoryPattern;

import java.util.Map;

/**
 * @author thbelief
 * @date 2021/12/25 11:09 AM
 * @info 生产接口
 */
public interface IProduce {
    public void produce(int userId, Map<String, String> extraInfo);
}
