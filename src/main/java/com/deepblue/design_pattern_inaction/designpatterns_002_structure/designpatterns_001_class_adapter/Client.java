package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_001_class_adapter;

public class Client {

    public static void boudingBox(Shape shape) {
        shape.boundingBox();
    }

    public static void main(String[] args) {
        Shape shape = new TextShape();
        Client.boudingBox(shape);
    }
}
