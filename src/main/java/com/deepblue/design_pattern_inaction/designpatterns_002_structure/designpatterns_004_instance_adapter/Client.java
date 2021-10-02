package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_004_instance_adapter;


public class Client {

    public static void request(Target target) {
        target.targetRequest();
    }

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        Client.request(target);
    }
}
