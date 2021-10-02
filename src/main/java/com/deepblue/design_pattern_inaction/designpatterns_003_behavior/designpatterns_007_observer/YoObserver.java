package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_007_observer;

import lombok.Data;

@Data
public class YoObserver implements Observer{

    private String youName;

    @Override
    public void update(String name) {
        this.setYouName(name);
    }
}
