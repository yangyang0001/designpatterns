package com.deepblue.designpatterns_001_create.designpatterns_004_builder;

public class ConcreateBuilderA implements AbstractBuilder{
    @Override
    public ProductA createProduct() {
        return new ProductA();
    }
}
