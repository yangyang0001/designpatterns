package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_010_singleton;

import com.alibaba.fastjson.JSON;

public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("instance1: " + JSON.toJSONString(instance1) + ", instance1.hashCode: " + instance1.hashCode());
        System.out.println("instance2: " + JSON.toJSONString(instance2) + ", instance2.hashCode: " + instance2.hashCode());
        System.out.println(instance1.hashCode() == instance2.hashCode());
    }
}
