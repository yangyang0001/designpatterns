package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_005_bridge;

public class IconWindow implements Window{
    @Override
    public void drawText() {
        System.out.println("IconWindow drawText()");
    }

    @Override
    public void drawRect() {
        System.out.println("IconWindow drawRect()");
    }
}
