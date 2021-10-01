package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_005_bridge;

public class PMWindowImplementor implements WindowImplementor{
    @Override
    public void devDrawText() {
        System.out.println("PMWindowImplementor devDrawText()");
    }

    @Override
    public void devDrawLine() {
        System.out.println("PMWindowImplementor devDrawLine()");
    }

    @Override
    public void drawText() {
    }

    @Override
    public void drawRect() {
    }
}
