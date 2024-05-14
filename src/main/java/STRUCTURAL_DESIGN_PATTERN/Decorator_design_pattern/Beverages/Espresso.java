package STRUCTURAL_DESIGN_PATTERN.Decorator_design_pattern.Beverages;

public class Espresso implements BEVERAGES{

    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "This is Espresso for you sir";
    }
}
