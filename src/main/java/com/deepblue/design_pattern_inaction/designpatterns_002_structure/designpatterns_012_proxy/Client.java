package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_012_proxy;

public class Client {
    public static void invokeProxyMethod(Subject subject) {
        subject.request();
    }

    public static void main(String[] args) {
        Subject subject = new Proxy(new RealSubject());
        Client.invokeProxyMethod(subject);
    }
}
