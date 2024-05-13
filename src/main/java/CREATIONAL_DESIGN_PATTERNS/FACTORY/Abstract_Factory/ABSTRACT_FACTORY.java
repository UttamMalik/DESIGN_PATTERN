package CREATIONAL_DESIGN_PATTERNS.FACTORY.Abstract_Factory;

import CREATIONAL_DESIGN_PATTERNS.FACTORY.COMPONENT.QUERY;
import CREATIONAL_DESIGN_PATTERNS.FACTORY.COMPONENT.TRANSACTION;

public abstract class ABSTRACT_FACTORY {
    public abstract QUERY createQuery();
    public abstract TRANSACTION createThransaction();

}
