package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_010_decorator;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ConcreateDecoratorA extends Decorator{
    @Override
    public void draw() {
        System.out.println("ConcreateDecoratorA draw()");
        component.draw();
        concreateDraw();
    }

    public void concreateDraw() {
        System.out.println("ConcreateDecoratorA concreateDraw()");
    }
}
