package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_003_instance_adapter;

public class TextShape implements Shape{

    private TextView textView;

    public TextShape (TextView textView) {
        this.textView = textView;
    }

    @Override
    public void boundingBox() {
        textView.getExtent();
    }

    @Override
    public void createManipulator() {

    }
}
