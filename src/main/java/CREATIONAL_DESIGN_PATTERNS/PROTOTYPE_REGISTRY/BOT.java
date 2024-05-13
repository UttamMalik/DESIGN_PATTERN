package CREATIONAL_DESIGN_PATTERNS.PROTOTYPE_REGISTRY;

public abstract class BOT implements Prototype<BOT>{
    BOT_TYPE type;

    BOT(BOT_TYPE type){
        this.type = type;
    }
    public BOT_TYPE getType() {
        return type;
    }

    @Override
    public BOT copy() {
        return null;
    }
}
