package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_010_decorator;

public class ConcreteComponent implements Component{
    @Override
    public void draw() {
        System.out.println("ConcreteComponent draw()");
    }
}
