package com.deepblue.designpatterns_002_structure.designpatterns_012_proxy;

public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("RealSubject request()");
    }
}
