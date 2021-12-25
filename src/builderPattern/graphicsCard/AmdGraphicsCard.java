package builderPattern.graphicsCard;

import builderPattern.IPart;

/**
 * @author thbelief
 * @date 2021/12/25 11:11 PM
 * @info
 */
public class AmdGraphicsCard implements IPart {
    @Override
    public String paretsName() {
        return getClass().getSimpleName();
    }

    @Override
    public String brand() {
        return "Amd";
    }

    @Override
    public String model() {
        return "880";
    }

    @Override
    public String price() {
        return "4000";
    }

    @Override
    public String info() {
        return null;
    }
}
