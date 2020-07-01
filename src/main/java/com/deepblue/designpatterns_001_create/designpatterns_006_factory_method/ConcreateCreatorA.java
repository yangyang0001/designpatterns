package com.deepblue.designpatterns_001_create.designpatterns_006_factory_method;



public class ConcreateCreatorA implements AbstractCreator {
    @Override
    public AbstractProduct createProduct() {
        return new ConcreateProductA();
    }
}
