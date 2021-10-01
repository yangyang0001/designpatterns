package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_013_proxy_jdk;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject request()");
    }
}
