package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_012_proxy_cglib;

public class FirstSubject implements Subject{

    @Override
    public String request() {
        System.out.println("first subject request  invoke!");
        return "first request  invoke!";
    }
}
