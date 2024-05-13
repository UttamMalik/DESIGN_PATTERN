package CREATIONAL_DESIGN_PATTERNS.FACTORY;

import CREATIONAL_DESIGN_PATTERNS.FACTORY.Abstract_Factory.ABSTRACT_FACTORY;
import CREATIONAL_DESIGN_PATTERNS.FACTORY.COMPONENT.QUERY;
import CREATIONAL_DESIGN_PATTERNS.FACTORY.Database.DATABASE;
import CREATIONAL_DESIGN_PATTERNS.FACTORY.Database.NON_RELATIONAL_DATABASE;
import CREATIONAL_DESIGN_PATTERNS.FACTORY.Database.RELATIONAL_DATABASE;
import org.springframework.boot.logging.java.JavaLoggingSystem;

import java.util.Queue;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String temp;
        Scanner sc = new Scanner(System.in);
        temp = sc.next();

        DATABASE database = createDatabase(temp);
        ABSTRACT_FACTORY factory = database.createFactory();
        QUERY query = factory.createQuery();
        query.printQuery();
    }
    private static DATABASE createDatabase(String temp){
        switch (temp)
        {
            case "Relational" :
                return new RELATIONAL_DATABASE();
            case "NonRelational" :
                return new NON_RELATIONAL_DATABASE();
            default:
                return null;
        }
    }
}
