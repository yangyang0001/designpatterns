package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_005_strategy;

public class TexStrategy implements Strategy {
    @Override
    public void lineBreak() {
        System.out.println("TexStrategy invoke lineBreak()");
    }
}
