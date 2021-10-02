package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_002_class_adapter;

/**
 * 适配器模式 4部分
 * 解决问题: 新的接口和老的接口不兼容, 中间要个转换器
 *          类似于电源和各种设备之间要个不同设备的充电器一样, 这样就可以配合工作了
 *
 * Client
 * Target
 * Adapter
 * Adaptee
 */
public class Client {

    public static void clientRequest(Target target) {
        target.request();
    }

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        Client.clientRequest(adapter);
    }

}
