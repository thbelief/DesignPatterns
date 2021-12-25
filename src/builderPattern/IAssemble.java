package builderPattern;

/**
 * @author thbelief
 * @date 2021/12/25 11:18 PM
 * @info 组装接口
 */
public interface IAssemble {
    IAssemble addGraphicsCard(IPart iPart);

    IAssemble addMainBoard(IPart iPart);

    String getInfos();
}
