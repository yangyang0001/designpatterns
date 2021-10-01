package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_010_template_method;

public class Client {

    public static void main(String[] args) {
        AbstractClass template = new ConcreteClass();
        template.executeTemplateMethod();
    }

}
