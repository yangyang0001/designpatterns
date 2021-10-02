package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_008_composite;


import com.alibaba.fastjson.JSON;

/**
 * Composite 组合模式
 *
 * Client Component Composite Leaf  四个部分组成了 组合模式
 */
public class Client {

    public static Component callComponent(Component component) {
        Composite composite = new Composite();
        composite.setId(1000L);
        component.addChild(composite);
        return component;
    }

    public static void main(String[] args) {
        Composite composite = new Composite();
        composite.setId(1L);
        Component component = Client.callComponent(composite);
        System.out.println("component:" + JSON.toJSONString(component));

    }

}
