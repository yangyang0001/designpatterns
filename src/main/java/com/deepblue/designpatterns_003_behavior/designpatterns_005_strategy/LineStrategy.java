package com.deepblue.designpatterns_003_behavior.designpatterns_005_strategy;

public class LineStrategy implements Strategy {
    @Override
    public void lineBreak() {
        System.out.println("LineStrategy invoke lineBreak()");
    }
}
