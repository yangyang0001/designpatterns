package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_000_test;

/**
 *
 */
public abstract class ExecuteHandler implements ExecuteInterface {

    public abstract void doExecute();

    public void execute() {
        doExecute();
    }

}
