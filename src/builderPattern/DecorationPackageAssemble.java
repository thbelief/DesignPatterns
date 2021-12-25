package builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thbelief
 * @date 2021/12/25 11:22 PM
 * @info
 */
public class DecorationPackageAssemble implements IAssemble {
    private List<IPart> mList = new ArrayList<>();
    private int mPrices = 0;
    private String mLevel;

    public DecorationPackageAssemble(String level) {
        this.mLevel = level;
    }

    @Override
    public IAssemble addGraphicsCard(IPart iPart) {
        mList.add(iPart);
        mPrices += Integer.parseInt(iPart.price());
        return this;
    }

    @Override
    public IAssemble addMainBoard(IPart iPart) {
        mList.add(iPart);
        mPrices += Integer.parseInt(iPart.price());
        return this;
    }

    @Override
    public String getInfos() {
        StringBuilder stringBuilder = new StringBuilder("...................\n");
        stringBuilder.append("prices ").append(mPrices).append("\n");
        stringBuilder.append("level ").append(mLevel).append("\n");
        for (IPart iPart : mList) {
            stringBuilder.append(iPart.getInfos());
        }
        return stringBuilder.toString();
    }
}
