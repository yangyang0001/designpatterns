package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_012_proxy_cglib;

import org.springframework.cglib.proxy.Enhancer;

public class Client {

    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(FirstSubject.class);
        enhancer.setCallback(new CommonInterceptor());
        Subject subject0 = (Subject) enhancer.create();
        String response0 = subject0.request();
        System.out.println("first response is  :" + response0);


        enhancer.setSuperclass(SecondSubject.class);
        enhancer.setCallback(new CommonInterceptor());
        Subject subject1 = (Subject) enhancer.create();
        String response1 = subject1.request();
        System.out.println("second response is :" + response1);

    }
}
