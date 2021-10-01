package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_002_class_adapter;

/**
 * 适配器
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        specialRequest();
    }
}
