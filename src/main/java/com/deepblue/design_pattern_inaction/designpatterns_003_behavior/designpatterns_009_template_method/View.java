package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_009_template_method;

public abstract class View {

    public void setFocus() {
        System.out.println("View setFocus()");
    }

    public void resetFocus() {
        System.out.println("View resetFocus()");
    }

    public abstract void doDisplay();

    public void display() {
        setFocus();
        doDisplay();
        resetFocus();
    }


}
