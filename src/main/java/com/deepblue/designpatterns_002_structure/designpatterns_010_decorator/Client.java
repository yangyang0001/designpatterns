package com.deepblue.designpatterns_002_structure.designpatterns_010_decorator;

import org.checkerframework.checker.units.qual.C;

public class Client {

    public static void invokeDraw(Component component) {
        component.draw();
    }

    public static void main(String[] args) {
        ConcreateDecoratorA decoratorA = new ConcreateDecoratorA();
        ConcreateDecoratorB decoratorB = new ConcreateDecoratorB();
        ConcreateComponent  component  = new ConcreateComponent();

        decoratorA.setComponent(decoratorB);
        decoratorB.setComponent(component);

        Client.invokeDraw(decoratorA);
    }
}
