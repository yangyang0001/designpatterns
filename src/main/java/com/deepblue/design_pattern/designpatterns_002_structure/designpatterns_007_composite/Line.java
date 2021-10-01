package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_007_composite;

import java.util.List;

public class Line extends Graphic{
    @Override
    public void draw() {
        System.out.println("Line draw()");
    }

    @Override
    public void addChild(Graphic child) {

    }

    @Override
    public void removeChild(Graphic child) {

    }

    @Override
    public Graphic getChild(Graphic child) {
        return null;
    }

    @Override
    public List<Graphic> getAllChild() {
        return null;
    }
}
