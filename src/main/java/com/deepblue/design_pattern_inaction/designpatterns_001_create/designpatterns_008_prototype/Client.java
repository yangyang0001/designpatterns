package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_008_prototype;

import com.alibaba.fastjson.JSON;

/**
 * 组成部分
 *      Prototype ConcretePrototype Client
 *      这里的Prototype 就是提供的抽象产品 AbstractProduct
 */
public class Client {

    public static ConcreteProductA createProduct(ConcreteProductA productA) throws CloneNotSupportedException {
        return (ConcreteProductA) productA.clone();
    }

    public static ConcreteProductB createProduct(ConcreteProductB productB) throws CloneNotSupportedException {
        return (ConcreteProductB) productB.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcreteProductA productA = Client.createProduct(new ConcreteProductA());
        productA.setProductNo(1L);
        productA.setProductName("ConcreteProductA");
        productA.setAProperty("AAAA");

        ConcreteProductB productB = Client.createProduct(new ConcreteProductB());
        productB.setProductNo(2L);
        productB.setProductName("ConcreteProductB");
        productB.setBProperty("BBBB");

        System.out.println("productA:" + JSON.toJSONString(productA));
        System.out.println("productB:" + JSON.toJSONString(productB));
    }

}
