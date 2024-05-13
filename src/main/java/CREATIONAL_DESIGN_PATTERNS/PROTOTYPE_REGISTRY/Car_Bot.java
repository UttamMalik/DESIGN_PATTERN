package CREATIONAL_DESIGN_PATTERNS.PROTOTYPE_REGISTRY;

public class Car_Bot extends BOT{
    int tyres;
    String color;
    int maxSpeed;


    Car_Bot(int tyres, String color, int maxSpeed, BOT_TYPE type){
        super(type);
        this.tyres = tyres;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    Car_Bot(Car_Bot original){
        this(original.tyres, original.color, original.maxSpeed,original.type);
    }


    @Override
    public Car_Bot copy() {
        return new Car_Bot(this);
    }
}
