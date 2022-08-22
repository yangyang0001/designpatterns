package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_006_factory_method;

public class ConcreteCreatorB implements AbstractCreator {
    @Override
    public AbstractProduct createProduct() {
        return new ConcreteProductB();
    }
}
