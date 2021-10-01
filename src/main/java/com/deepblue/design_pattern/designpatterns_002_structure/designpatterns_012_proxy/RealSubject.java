package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_012_proxy;

public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("RealSubject request()");
    }
}
