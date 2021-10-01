package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_009_decorator;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BorderDecorator extends Decorator{

    @Override
    public void draw() {
        System.out.println("BorderDecorator draw()");
        component.draw();
        borderDraw();
    }

    public void borderDraw() {
        System.out.println("BorderDecorator borderDraw()");
    }
}
