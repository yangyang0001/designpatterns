package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_005_strategy;

public class ArrayStrategy implements Strategy {
    @Override
    public void lineBreak() {
        System.out.println("TexStrategy invoke lineBreak()");
    }
}
