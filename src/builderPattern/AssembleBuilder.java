package builderPattern;

import builderPattern.graphicsCard.AmdGraphicsCard;
import builderPattern.graphicsCard.IntelGraphicsCard;
import builderPattern.mainBoard.AbcMainBoard;
import builderPattern.mainBoard.IntelMainBoard;

/**
 * @author thbelief
 * @date 2021/12/25 11:34 PM
 * @info
 */
public class AssembleBuilder {
    public IAssemble levelLow() {
        return new DecorationPackageAssemble("low").addGraphicsCard(new AmdGraphicsCard()).addMainBoard(new IntelMainBoard());
    }

    public IAssemble levelMid() {
        return new DecorationPackageAssemble("mid").addGraphicsCard(new AmdGraphicsCard()).addMainBoard(new AbcMainBoard());
    }

    public IAssemble levelTop() {
        return new DecorationPackageAssemble("top").addGraphicsCard(new IntelGraphicsCard()).addMainBoard(new AbcMainBoard());
    }
}
