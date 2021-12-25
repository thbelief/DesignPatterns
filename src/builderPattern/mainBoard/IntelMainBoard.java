package builderPattern.mainBoard;

import builderPattern.IPart;

/**
 * @author thbelief
 * @date 2021/12/25 11:14 PM
 * @info
 */
public class IntelMainBoard implements IPart {
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
        return "2000";
    }

    @Override
    public String price() {
        return "3000";
    }

    @Override
    public String info() {
        return null;
    }
}
