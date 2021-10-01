package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_002_factory;

import com.alibaba.fastjson.JSON;

public class Client {

    public static AbstractProduct getProduct(AbstractFactory factory) {
        return factory.getProduct(factory);
    }

    public static void main(String[] args) {
        AbstractFactory factoryA = new ConcreateFactoryA();
        AbstractProduct productA = Client.getProduct(factoryA);

        AbstractFactory factoryB = new ConcreateFactoryB();
        AbstractProduct productB = Client.getProduct(factoryB);

        System.out.println("productA: " + JSON.toJSONString(productA));
        System.out.println("productB: " + JSON.toJSONString(productB));
    }
}
