package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_006_bridge;

public class ConcreateImplementor implements AbstractionImplementor{
    @Override
    public void newMethod() {
        System.out.println("ConcreateImplementor newMethod()");
    }

    @Override
    public void oldMethod() {
        System.out.println("ConcreateImplementor oldMethod()");
    }
}
