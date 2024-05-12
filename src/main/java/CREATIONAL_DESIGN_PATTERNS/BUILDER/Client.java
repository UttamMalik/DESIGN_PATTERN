package CREATIONAL_DESIGN_PATTERNS.BUILDER;

public class Client {
    public static void main(String[] args) {
        Club object = Club.getBuilder()
                        .setAge(39)
                        .setName("abc")
                        .build();
    }
}
