package builderPattern.mainBoard;

import builderPattern.IPart;

/**
 * @author thbelief
 * @date 2021/12/25 11:13 PM
 * @info
 */
public class AbcMainBoard implements IPart {
    @Override
    public String paretsName() {
        return getClass().getSimpleName();
    }

    @Override
    public String brand() {
        return "Abc";
    }

    @Override
    public String model() {
        return "2021";
    }

    @Override
    public String price() {
        return "10000";
    }

    @Override
    public String info() {
        return null;
    }
}
