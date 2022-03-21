package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_012_proxy_cglib;

import org.springframework.cglib.proxy.Enhancer;

public class Client {

    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(RealSubject.class);

        enhancer.setCallback(new SubjectInterceptor());

        Subject subject = (Subject) enhancer.create();

        String response = subject.request();

        System.out.println("response is :" + response);

    }
}
