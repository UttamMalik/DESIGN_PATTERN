package CREATIONAL_DESIGN_PATTERNS.SINGLETON;

public class Client {
    public static void main(String[] args) {
        DBconnection obj1 = DBconnection.getObject(10);
        DBconnection obj2 = DBconnection.getObject(39);
        System.out.println(obj1.hashCode()+" = "+obj2.hashCode());
        System.out.println(obj1.getVal()+" ----------- "+ obj2.getVal());

//        ------------ OUTPUT ------------
//        20132171 = 20132171
//        10 ----------- 10
    }
}
