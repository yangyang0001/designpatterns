package com.deepblue.designpatterns_002_structure.designpatterns_013_proxy_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject request()");
    }
}
