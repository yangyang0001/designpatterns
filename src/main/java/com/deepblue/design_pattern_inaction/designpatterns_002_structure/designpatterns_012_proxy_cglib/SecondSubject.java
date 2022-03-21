package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_012_proxy_cglib;

public class SecondSubject implements Subject{

    @Override
    public String request() {
        System.out.println("second subject request invoke!");
        return "second request invoke!";
    }
}
