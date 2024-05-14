package STRUCTURAL_DESIGN_PATTERN.Decorator_design_pattern.Addons;

import STRUCTURAL_DESIGN_PATTERN.Decorator_design_pattern.Beverages.BEVERAGES;

public class WHIP implements ADDONS{
    BEVERAGES b;
    public WHIP(BEVERAGES b){
        this.b = b;
    }
    @Override
    public int getCost() {
        return 100+b.getCost();
    }

    @Override
    public String getDescription() {
        return b.getDescription()+" and also added WHIP on top of it !!";
    }
}
