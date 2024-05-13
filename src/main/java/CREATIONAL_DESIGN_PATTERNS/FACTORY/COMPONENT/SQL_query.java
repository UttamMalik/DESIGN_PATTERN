package CREATIONAL_DESIGN_PATTERNS.FACTORY.COMPONENT;

public class SQL_query implements QUERY{
    @Override
    public void printQuery() {
        System.out.println("SQL query ");
    }
}
