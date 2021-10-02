package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_006_strategy;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("ConcreteStrategyA execute()");
    }
}
