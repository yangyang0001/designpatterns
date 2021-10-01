package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_013_proxy_jdk;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");


        Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                new Class[]{Subject.class}, new ProxyHandler(new RealSubject()));
        subject.request();
    }
}
