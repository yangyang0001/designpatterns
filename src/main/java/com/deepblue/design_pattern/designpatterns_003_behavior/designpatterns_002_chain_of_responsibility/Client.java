package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_002_chain_of_responsibility;

public class Client {
    public static void main(String[] args) {

        Component component = new ConcreteComponent();
        Composite compositeB = new ConcreteCompositeB(component);
        Component compositeA = new ConcreteCompositeA(compositeB);
        compositeA.request();

    }
}
