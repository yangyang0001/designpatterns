package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_004_builder;

public class ConcreteBuilderA implements AbstractBuilder{
    @Override
    public ProductA createProduct() {
        return new ProductA();
    }
}
