package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_000_chain_of_responsibility;

/**
 *
 */
public class SeconHandler extends ExecuteHandler{
    @Override
    public void doExecute() {
        System.out.println("SeconHandler doExecute method invoke!");
    }
}
