package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_002_factory;

public class ConcreteFactoryB implements AbstractFactory {

    @Override
    public AbstractProduct getProduct(AbstractFactory factory) {
        ConcreteProductB productB = new ConcreteProductB();
        productB.setId(2L);
        productB.setProductName("ConcreteProductB");
        return productB;
    }

}
