package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_011_proxy_jdk;

public class RealSubject implements Subject{

    @Override
    public String sayHello(String username) {
        return "hello " + username;
    }
}
