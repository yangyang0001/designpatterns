package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_006_factory_method;

import com.alibaba.fastjson.JSON;

public class Client {
    public static AbstractProduct createProduct(FactoryMethod method, AbstractCreator creator) {
        return method.createProduct(creator);
    }


    public static void main(String[] args) {
        FactoryMethod method = new FactoryMethod();
        AbstractCreator creatorA = new ConcreteCreatorA();
        AbstractCreator creatorB = new ConcreteCreatorB();

        ConcreteProductA productA = (ConcreteProductA) Client.createProduct(method, creatorA);
        productA.setProductNo(1L);
        productA.setProductName("ProductA");
        productA.setAProperty("AAAA");
        ConcreteProductB productB = (ConcreteProductB) Client.createProduct(method, creatorB);
        productB.setProductNo(2L);
        productB.setProductName("ProductB");
        productB.setBProperty("BBBB");

        System.out.println("productA:" + JSON.toJSONString(productA));
        System.out.println("productB:" + JSON.toJSONString(productB));
    }
}
