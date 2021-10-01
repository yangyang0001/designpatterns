package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_002_factory;

public class ConcreateFactoryB implements AbstractFactory {

    @Override
    public AbstractProduct getProduct(AbstractFactory factory) {
        ConcreateProductB productB = new ConcreateProductB();
        productB.setId(2L);
        productB.setProductName("ConcreateProductB");
        return productB;
    }

}
