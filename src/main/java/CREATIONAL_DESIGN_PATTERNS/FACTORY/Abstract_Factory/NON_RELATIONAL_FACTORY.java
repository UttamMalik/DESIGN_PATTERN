package CREATIONAL_DESIGN_PATTERNS.FACTORY.Abstract_Factory;

import CREATIONAL_DESIGN_PATTERNS.FACTORY.COMPONENT.NO_SQL_query;
import CREATIONAL_DESIGN_PATTERNS.FACTORY.COMPONENT.No_SQL_Transaction;
import CREATIONAL_DESIGN_PATTERNS.FACTORY.COMPONENT.QUERY;
import CREATIONAL_DESIGN_PATTERNS.FACTORY.COMPONENT.TRANSACTION;

public class NON_RELATIONAL_FACTORY extends ABSTRACT_FACTORY{
    @Override
    public QUERY createQuery() {
        return new NO_SQL_query();
    }

    @Override
    public TRANSACTION createThransaction() {
        return new No_SQL_Transaction();
    }
}
