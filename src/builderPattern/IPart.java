package builderPattern;

/**
 * @author thbelief
 * @date 2021/12/25 11:03 PM
 * @info 组装电脑的配件接口
 */
public interface IPart {
    /**
     * 配件名称
     */
    String paretsName();

    /**
     * 品牌
     */
    String brand();

    /**
     * 型号
     */
    String model();

    /**
     * 价格
     */
    String price();

    /**
     * 其它信息
     */
    String info();

    default String getInfos() {
        return paretsName() + "\n" + brand() + "\n" + model() + "\n" + price() + "\n" + info() + "\n";
    }
}
