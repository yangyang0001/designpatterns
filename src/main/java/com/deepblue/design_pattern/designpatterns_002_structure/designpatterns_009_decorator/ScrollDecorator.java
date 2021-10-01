package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_009_decorator;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ScrollDecorator extends Decorator{

    @Override
    public void draw() {
        System.out.println("ScrollDecorator draw()");
        component.draw();
        drawScroll();
    }

    public void drawScroll() {
        System.out.println("ScrollDecorator drawScroll()");
    }
}
