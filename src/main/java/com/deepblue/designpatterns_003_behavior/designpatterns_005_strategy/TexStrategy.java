package com.deepblue.designpatterns_003_behavior.designpatterns_005_strategy;

public class TexStrategy implements Strategy {
    @Override
    public void lineBreak() {
        System.out.println("TexStrategy invoke lineBreak()");
    }
}
