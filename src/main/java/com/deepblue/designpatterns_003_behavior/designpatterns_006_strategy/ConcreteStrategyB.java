package com.deepblue.designpatterns_003_behavior.designpatterns_006_strategy;

public class ConcreteStrategyB implements Strategy {

    @Override
    public void execute() {
        System.out.println("ConcreteStrategyB execute()");
    }
}
