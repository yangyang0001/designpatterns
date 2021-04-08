package com.deepblue.designpatterns_003_behavior.designpatterns_010_template_method;

public class Client {

    public static void main(String[] args) {
        AbstractClass template = new ChildConcreteClass();
        template.executeTemplateMethod();
    }

}
