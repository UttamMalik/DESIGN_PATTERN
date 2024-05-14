package STRUCTURAL_DESIGN_PATTERN.Decorator_design_pattern;

import STRUCTURAL_DESIGN_PATTERN.Decorator_design_pattern.Addons.Milk;
import STRUCTURAL_DESIGN_PATTERN.Decorator_design_pattern.Addons.WHIP;
import STRUCTURAL_DESIGN_PATTERN.Decorator_design_pattern.Beverages.BEVERAGES;
import STRUCTURAL_DESIGN_PATTERN.Decorator_design_pattern.Beverages.Espresso;

public class Client {
    public static void main(String[] args) {
        BEVERAGES beverages = new Espresso();
        beverages = new Milk(beverages);
        System.out.println(beverages.getCost());
        System.out.println(beverages.getDescription());

        beverages = new WHIP(beverages);
        System.out.println(beverages.getDescription());
        System.out.println(beverages.getCost());
    }
}
