package com.deepblue.designpatterns_003_behavior.designpatterns_010_template_method;

public abstract class ConcreteClass extends AbstractClass {

    @Override
    public void doMethod() {
        doMethodConcreteClassA();
        System.out.println("ConcreteClass doMethod()");
        doMethodConcreteClassB();
    }

    public abstract void doMethodConcreteClassA();
    public abstract void doMethodConcreteClassB();
}
