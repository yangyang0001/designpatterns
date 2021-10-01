package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_002_chain_of_responsibility;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConcreteCompositeA extends Composite{

    public ConcreteCompositeA(Component component) {
        super();
        this.component = component;
    }

    @Override
    public void request() {
        component.request();
    }
}
