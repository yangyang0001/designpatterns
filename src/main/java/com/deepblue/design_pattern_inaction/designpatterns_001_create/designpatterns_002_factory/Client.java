package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_002_factory;

import com.alibaba.fastjson.JSON;

public class Client {

    public static AbstractProduct getProduct(AbstractFactory factory) {
        return factory.getProduct(factory);
    }

    public static void main(String[] args) {
        AbstractFactory factoryA = new ConcreteFactoryA();
        AbstractProduct productA = Client.getProduct(factoryA);

        AbstractFactory factoryB = new ConcreteFactoryB();
        AbstractProduct productB = Client.getProduct(factoryB);

        System.out.println("productA: " + JSON.toJSONString(productA));
        System.out.println("productB: " + JSON.toJSONString(productB));
    }
}
