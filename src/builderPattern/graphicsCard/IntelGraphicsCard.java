package builderPattern.graphicsCard;

import builderPattern.IPart;

/**
 * @author thbelief
 * @date 2021/12/25 11:10 PM
 * @info
 */
public class IntelGraphicsCard implements IPart {
    @Override
    public String paretsName() {
        return getClass().getSimpleName();
    }

    @Override
    public String brand() {
        return "Intel";
    }

    @Override
    public String model() {
        return "3080";
    }

    @Override
    public String price() {
        return "5000";
    }

    @Override
    public String info() {
        return null;
    }
}
