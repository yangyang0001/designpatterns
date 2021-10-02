package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_009_decorator;

public class TextView implements VisualComponent{

    @Override
    public void draw() {
        System.out.println("TextView draw()");
    }
}
