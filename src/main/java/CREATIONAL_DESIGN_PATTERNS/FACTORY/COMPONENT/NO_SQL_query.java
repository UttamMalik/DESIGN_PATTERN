package CREATIONAL_DESIGN_PATTERNS.FACTORY.COMPONENT;

public class NO_SQL_query implements QUERY{
    @Override
    public void printQuery() {
        System.out.println("NO SQL query");
    }
}
