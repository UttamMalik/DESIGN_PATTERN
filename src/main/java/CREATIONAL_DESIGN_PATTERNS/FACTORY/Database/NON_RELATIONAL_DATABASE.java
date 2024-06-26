package CREATIONAL_DESIGN_PATTERNS.FACTORY.Database;

import CREATIONAL_DESIGN_PATTERNS.FACTORY.Abstract_Factory.ABSTRACT_FACTORY;
import CREATIONAL_DESIGN_PATTERNS.FACTORY.Abstract_Factory.NON_RELATIONAL_FACTORY;

public class NON_RELATIONAL_DATABASE implements DATABASE {

    @Override
    public ABSTRACT_FACTORY createFactory() {
        return new NON_RELATIONAL_FACTORY();
    }
}
