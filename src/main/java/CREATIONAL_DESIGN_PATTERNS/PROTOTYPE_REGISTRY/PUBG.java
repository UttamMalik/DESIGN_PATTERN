package CREATIONAL_DESIGN_PATTERNS.PROTOTYPE_REGISTRY;

public class PUBG {
    public static void main(String[] args) {
        REGISTRY registry = new ResigtryImplementationClass();
        BOT humanBot = new Player_Bot(2,2,2,"Fair","Fair",BOT_TYPE.PLAYER);
        BOT carBot = new Car_Bot(4,"Orange",100,BOT_TYPE.CAR);


        registry.addToRegsitry(humanBot);
        registry.addToRegsitry(carBot);



        BOT newCarBot = registry.getProtoType(BOT_TYPE.CAR);
        System.out.println(carBot.hashCode()+" --- "+newCarBot.hashCode());
    }
}
