package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_002_factory;

public interface AbstractFactory {
    public AbstractProduct getProduct(AbstractFactory factory);
}
