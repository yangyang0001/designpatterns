package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_005_bridge;

public class XWindowImplementor implements WindowImplementor{
    @Override
    public void devDrawText() {
        System.out.println("XWindowImplementor devDrawText()");
    }

    @Override
    public void devDrawLine() {
        System.out.println("XWindowImplementor devDrawLine()");
    }

    @Override
    public void drawText() {

    }

    @Override
    public void drawRect() {

    }
}
