package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_005_strategy;

public class Client {

    public static void callStrategy(Strategy strategy) {
        TextContext textContext = new TextContext(strategy);
        textContext.lineBreak();
    }

    public static void main(String[] args) {
        Strategy strategy = new LineStrategy();
        Client.callStrategy(strategy);
    }


}
