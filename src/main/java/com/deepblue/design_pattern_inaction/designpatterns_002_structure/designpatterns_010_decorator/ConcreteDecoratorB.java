package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_010_decorator;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ConcreteDecoratorB extends Decorator{
    @Override
    public void draw() {
        System.out.println("ConcreteDecoratorB draw()");
        component.draw();
        ConcreteDraw();
    }

    public void ConcreteDraw() {
        System.out.println("ConcreteDecoratorB ConcreteDraw()");
    }
}
