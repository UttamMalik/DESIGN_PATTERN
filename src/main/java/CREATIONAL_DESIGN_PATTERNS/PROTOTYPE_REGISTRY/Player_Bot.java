package CREATIONAL_DESIGN_PATTERNS.PROTOTYPE_REGISTRY;

public class Player_Bot extends BOT{
    int eyes;
    int hands;
    int legs;
    String eyesColor;
    String skinColor;


    // and many more specifications
    Player_Bot(int eyes, int hands, int legs, String eyesColor, String skinColor,BOT_TYPE type){
        super(type);
        this.eyes = eyes;
        this.hands = hands;
        this.eyesColor = eyesColor;
        this.skinColor = skinColor;
    }

    Player_Bot(Player_Bot original){
       this(original.eyes, original.hands, original.legs, original.eyesColor, original.skinColor,original.type);
    }

    @Override
    public Player_Bot copy() {
        return new Player_Bot(this);
    }
}
