package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_001_class_adapter;

public class PolygonShape implements Shape {
    @Override
    public void boundingBox() {
        System.out.println("PolygonShape boundingBox()");
    }

    @Override
    public void createManipulator() {
        System.out.println("PolygonShape createManipulator()");
    }
}
