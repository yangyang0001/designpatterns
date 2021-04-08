package com.deepblue.designpatterns_003_behavior.designpatterns_010_template_method;

public class ChildConcreteClass extends ConcreteClass {

    @Override
    public void before() {
        System.out.println("ChildConcreteClass before() invoked!");
    }

    @Override
    public void after() {
        System.out.println("ChildConcreteClass after() invoked!");
    }

    @Override
    public void doMethodConcreteClassA() {
        System.out.println("ChildConcreteClass doMethodConcreteClassA() invoked!");
    }

    @Override
    public void doMethodConcreteClassB() {
        System.out.println("ChildConcreteClass doMethodConcreteClassB() invoked!");
    }
}
