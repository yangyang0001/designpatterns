package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_010_decorator;

public class ConcreateComponent implements Component{
    @Override
    public void draw() {
        System.out.println("ConcreateComponent draw()");
    }
}
