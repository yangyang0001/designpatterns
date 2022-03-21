package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_012_proxy_cglib;

public class RealSubject implements Subject{

    @Override
    public String request() {
        System.out.println("RealSubject request invoke!");
        return "welcome to cglib";
    }
}
