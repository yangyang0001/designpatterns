package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_005_strategy;

public class LineStrategy implements Strategy {
    @Override
    public void lineBreak() {
        System.out.println("LineStrategy invoke lineBreak()");
    }
}
