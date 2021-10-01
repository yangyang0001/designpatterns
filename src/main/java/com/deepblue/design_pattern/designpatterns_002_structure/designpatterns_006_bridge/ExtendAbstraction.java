package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_006_bridge;

public class ExtendAbstraction implements Abstraction{
    @Override
    public void oldMethod() {
        System.out.println("ExtendAbstraction oldMethod()");
    }
}
