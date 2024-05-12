package CREATIONAL_DESIGN_PATTERNS.BUILDER;

public class Club{
    int age;
    String  name;
    private Club(Builder b){
        if(b.age < 18) throw new RuntimeException("Buddy grow UP !!!");
        this.age = b.age;
        this.name = b.name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    public static class Builder
    {
        int age;
        String  name;
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Club build(){
            return new Club(this);
        }
    }
}
