package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_003_instance_adapter;

public class Client {

    public static void boundingBox(Shape shape) {
        shape.boundingBox();
    }

    public static void main(String[] args) {
        TextView textView = new TextView();
        TextShape shape = new TextShape(textView);
        Client.boundingBox(shape);
    }

}
