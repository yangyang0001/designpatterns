package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_000_mine_chain;

import lombok.Data;

/**
 *
 */
@Data
public abstract class ExecuteHandler implements ExecuteInterface {

    private ExecuteHandler handler;

    public final void execute() {
        this.doExecute();
        if(handler != null) {
            handler.execute();
        }
    }

}
