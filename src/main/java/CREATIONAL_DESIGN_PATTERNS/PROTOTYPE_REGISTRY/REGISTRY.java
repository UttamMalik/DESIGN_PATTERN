package CREATIONAL_DESIGN_PATTERNS.PROTOTYPE_REGISTRY;

public interface REGISTRY {
    public void addToRegsitry(BOT bot );
    public BOT getProtoType(BOT_TYPE type);
}
