package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_010_decorator;

public class Client {

    public static void invokeDraw(Component component) {
        component.draw();
    }

    public static void main(String[] args) {
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();
        ConcreteComponent component  = new ConcreteComponent();

        decoratorA.setComponent(decoratorB);
        decoratorB.setComponent(component);

        Client.invokeDraw(decoratorA);
    }
}
