package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_002_chain_of_responsibility;

import lombok.Data;

@Data
public class ConcreteCompositeB extends Composite{
    public ConcreteCompositeB(Component component) {
        super();
        this.component = component;
    }

    @Override
    public void request() {
        component.request();
    }
}

