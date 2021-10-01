package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_010_decorator;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ConcreateDecoratorB extends Decorator{
    @Override
    public void draw() {
        System.out.println("ConcreateDecoratorB draw()");
        component.draw();
        concreateDraw();
    }

    public void concreateDraw() {
        System.out.println("ConcreateDecoratorB concreateDraw()");
    }
}
