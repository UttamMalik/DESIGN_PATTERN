package CREATIONAL_DESIGN_PATTERNS.PROTOTYPE_REGISTRY;

import java.util.HashMap;

public class ResigtryImplementationClass implements REGISTRY{
    private HashMap<BOT_TYPE,BOT> map;

    ResigtryImplementationClass(){
        map = new HashMap<>();
    }
    @Override
    public void addToRegsitry(BOT bot) {
        map.put(bot.getType(),bot);
    }


    @Override
    public BOT getProtoType(BOT_TYPE type) {
        return map.get(type).copy();
    }

}
