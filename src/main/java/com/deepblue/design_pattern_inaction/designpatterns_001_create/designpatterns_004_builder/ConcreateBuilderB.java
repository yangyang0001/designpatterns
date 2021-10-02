package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_004_builder;

public class ConcreateBuilderB implements AbstractBuilder{

    @Override
    public ProductB createProduct() {
        return new ProductB();
    }
}
