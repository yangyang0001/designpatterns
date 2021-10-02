package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_010_template_method;

public abstract class AbstractClass {

    public void before() {
        System.out.println("AbstractClass before()");
    }

    public void after() {
        System.out.println("AbstractClass after()");
    }

    public abstract void doMethod();


    public void executeTemplateMethod() {
        before();
        doMethod();
        after();
    }
}
