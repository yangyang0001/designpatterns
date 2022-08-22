package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_006_bridge;

public class ConcreteImplementor implements AbstractionImplementor{
    @Override
    public void newMethod() {
        System.out.println("ConcreteImplementor newMethod()");
    }

    @Override
    public void oldMethod() {
        System.out.println("ConcreteImplementor oldMethod()");
    }
}
