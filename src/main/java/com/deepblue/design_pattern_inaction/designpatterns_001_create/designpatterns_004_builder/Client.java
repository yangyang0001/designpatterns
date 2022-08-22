package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_004_builder;

import com.alibaba.fastjson.JSON;

/**
 * 这里的导向器Director 就是 Client 类,代替Director
 * 思考：
 *      一个Director 可以有 n 个生产产品的方法, 同样Builder 可以有 n 个！
 * 总结：
 *      AbstractDirector ConcreteDirector AbstractBuilder ConcreteBuilder Product Client 组成
 */
public class Client {

    public static AbstractProduct createProduct(AbstractBuilder builder) {
        return builder.createProduct();
    }

    public static void main(String[] args) {
        AbstractBuilder builderA = new ConcreteBuilderA();
        ProductA productA = (ProductA) Client.createProduct(builderA);
        productA.setProductNo(1);
        productA.setProductName("productA");
        productA.setAProperty("aaaa");

        AbstractBuilder builderB = new ConcreteBuilderB();
        ProductB productB = (ProductB) Client.createProduct(builderB);
        productB.setProductNo(2);
        productB.setProductName("productB");
        productB.setBProperty("bbbb");

        System.out.println("productA:" + JSON.toJSONString(productA));
        System.out.println("productB:" + JSON.toJSONString(productB));
    }
}
