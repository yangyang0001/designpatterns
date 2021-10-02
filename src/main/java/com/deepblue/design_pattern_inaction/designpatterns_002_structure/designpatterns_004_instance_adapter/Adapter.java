package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_004_instance_adapter;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void targetRequest() {
        adaptee.specialRequest();
    }
}
