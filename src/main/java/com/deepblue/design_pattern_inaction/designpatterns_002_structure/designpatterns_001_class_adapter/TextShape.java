package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_001_class_adapter;

public class TextShape extends TextView implements Shape {
    @Override
    public void boundingBox() {
        getExtent();
    }

    @Override
    public void createManipulator() {

    }
}
