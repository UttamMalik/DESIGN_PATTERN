package STRUCTURAL_DESIGN_PATTERN.Decorator_design_pattern.Beverages;

public class HouseBlend implements BEVERAGES{

    @Override
    public int getCost() {
        return 90;
    }

    @Override
    public String getDescription() {
        return "This is HouseBlend for you Sir !!!";
    }
}
