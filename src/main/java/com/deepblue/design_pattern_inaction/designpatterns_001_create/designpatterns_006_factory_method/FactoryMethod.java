package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_006_factory_method;

public class FactoryMethod {
    public AbstractProduct createProduct(AbstractCreator creator) {
        return creator.createProduct();
    }
}
