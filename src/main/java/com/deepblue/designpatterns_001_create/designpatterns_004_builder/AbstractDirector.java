package com.deepblue.designpatterns_001_create.designpatterns_004_builder;

public interface AbstractDirector {
    public AbstractProduct createProduct(AbstractBuilder builder);
}
