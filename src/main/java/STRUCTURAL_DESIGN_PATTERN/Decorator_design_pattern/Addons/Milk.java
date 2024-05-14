package STRUCTURAL_DESIGN_PATTERN.Decorator_design_pattern.Addons;

import STRUCTURAL_DESIGN_PATTERN.Decorator_design_pattern.Beverages.BEVERAGES;

public class Milk implements ADDONS{
    BEVERAGES b;
    public Milk(BEVERAGES b){
        this.b = b;
    }
    @Override
    public int getCost() {
        return 30+ b.getCost();
    }

    @Override
    public String getDescription() {
        return b.getDescription()+", Added milk into you coffee sir";
    }
}
