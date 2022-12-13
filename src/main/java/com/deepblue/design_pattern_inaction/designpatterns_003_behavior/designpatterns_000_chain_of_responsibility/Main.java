package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_000_chain_of_responsibility;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

        ExecuteHandler handler1 = new FirstHandler();
        ExecuteHandler handler2 = new SeconHandler();
        ExecuteHandler handler3 = new ThirdHandler();

        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        handler1.execute();

    }
}
