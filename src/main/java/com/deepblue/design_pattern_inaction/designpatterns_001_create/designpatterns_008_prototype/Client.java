package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_008_prototype;

import com.alibaba.fastjson.JSON;

/**
 * 组成部分
 *      Prototype  ConcreatePrototype Client
 *      这里的Prototype 就是提供的抽象产品 AbstractProduct
 */
public class Client {

    public static ConcreateProductA createProduct(ConcreateProductA productA) throws CloneNotSupportedException {
        return (ConcreateProductA) productA.clone();
    }

    public static ConcreateProductB createProduct(ConcreateProductB productB) throws CloneNotSupportedException {
        return (ConcreateProductB) productB.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcreateProductA productA = Client.createProduct(new ConcreateProductA());
        productA.setProductNo(1L);
        productA.setProductName("ConcreateProductA");
        productA.setAProperty("AAAA");

        ConcreateProductB productB = Client.createProduct(new ConcreateProductB());
        productB.setProductNo(2L);
        productB.setProductName("ConcreateProductB");
        productB.setBProperty("BBBB");

        System.out.println("productA:" + JSON.toJSONString(productA));
        System.out.println("productB:" + JSON.toJSONString(productB));
    }

}
