package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_007_observer;

import lombok.Data;

@Data
public class MyObserver implements Observer{

    private String myName;

    @Override
    public void update(String name) {
        this.setMyName(name);
    }
}
