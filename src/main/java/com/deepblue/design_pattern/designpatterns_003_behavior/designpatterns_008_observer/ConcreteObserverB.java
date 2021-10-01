package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_008_observer;

import lombok.Data;

@Data
public class ConcreteObserverB implements Observer{

    private String receiver;

    @Override
    public void update(String name) {
        this.receiver = name;
    }
}
