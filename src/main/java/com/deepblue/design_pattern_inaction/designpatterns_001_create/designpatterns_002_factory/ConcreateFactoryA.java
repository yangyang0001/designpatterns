package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_002_factory;

public class ConcreateFactoryA implements AbstractFactory{

    @Override
    public AbstractProduct getProduct(AbstractFactory factory) {
        ConcreateProductA productA = new ConcreateProductA();
        productA.setId(1L);
        productA.setProductName("ConcreateProductA");
        return productA;
    }

}
