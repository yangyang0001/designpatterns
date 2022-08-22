package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_004_builder;

public class ConcreteDirector implements AbstractDirector{
    @Override
    public AbstractProduct createProduct(AbstractBuilder builder) {
        return builder.createProduct();
    }
}
