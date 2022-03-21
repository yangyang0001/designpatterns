package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_011_proxy_jdk;

public class Client {

    public static void invokeProxyMethod(Subject subject) {
        subject.request();
    }

    public static void main(String[] args) {
        Subject subject = new ProxyHandler(new RealSubject());
        Client.invokeProxyMethod(subject);
    }
}