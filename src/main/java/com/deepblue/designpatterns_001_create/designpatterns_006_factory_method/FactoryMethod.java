package com.deepblue.designpatterns_001_create.designpatterns_006_factory_method;

public class FactoryMethod {
    public AbstractProduct createProduct(AbstractCreator creator) {
        return creator.createProduct();
    }
}
