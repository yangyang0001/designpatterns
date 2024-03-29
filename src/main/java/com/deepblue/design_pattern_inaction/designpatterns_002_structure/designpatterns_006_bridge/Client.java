package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_006_bridge;

public class Client {

    public static void callMethod(Abstraction abstraction) {
        abstraction.oldMethod();
    }

    public static void callNewMethod(AbstractionImplementor implementor) {
        implementor.newMethod();
    }


    public static void main(String[] args) {
        Abstraction abstraction = new ExtendAbstraction();
        AbstractionImplementor implementor = new ConcreteImplementor();

        Client.callMethod(abstraction);
        Client.callNewMethod(implementor);
    }
}
