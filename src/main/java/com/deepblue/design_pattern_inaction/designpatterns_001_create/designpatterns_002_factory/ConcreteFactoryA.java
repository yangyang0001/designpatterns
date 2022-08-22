package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_002_factory;

public class ConcreteFactoryA implements AbstractFactory{

    @Override
    public AbstractProduct getProduct(AbstractFactory factory) {
        ConcreteProductA productA = new ConcreteProductA();
        productA.setId(1L);
        productA.setProductName("ConcreteProductA");
        return productA;
    }

}
