package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_001_class_adapter;

public class LineShape implements Shape {
    @Override
    public void boundingBox() {
        System.out.println("LineShape boundingBox()");
    }

    @Override
    public void createManipulator() {
        System.out.println("LineShape createManipulator()");
    }
}
