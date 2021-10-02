package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_004_builder;

public class ConcreateDirector implements AbstractDirector{
    @Override
    public AbstractProduct createProduct(AbstractBuilder builder) {
        return builder.createProduct();
    }
}
