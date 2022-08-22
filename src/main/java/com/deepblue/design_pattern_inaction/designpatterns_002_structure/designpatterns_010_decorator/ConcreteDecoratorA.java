package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_010_decorator;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ConcreteDecoratorA extends Decorator{
    @Override
    public void draw() {
        System.out.println("ConcreteDecoratorA draw()");
        component.draw();
        concreteDraw();
    }

    public void concreteDraw() {
        System.out.println("ConcreteDecoratorA concreteDraw()");
    }
}
