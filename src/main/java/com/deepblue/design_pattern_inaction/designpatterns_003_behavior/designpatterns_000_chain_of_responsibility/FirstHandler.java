package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_000_chain_of_responsibility;

/**
 *
 */
public class FirstHandler extends ExecuteHandler{
    @Override
    public void doExecute() {
        System.out.println("FirstHandler doExecute method invoke!");
    }
}
