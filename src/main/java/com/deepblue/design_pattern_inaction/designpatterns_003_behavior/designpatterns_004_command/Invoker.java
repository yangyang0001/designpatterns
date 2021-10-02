package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_004_command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Invoker {

    private Command command;

    public void execute() {
        command.execute();
    }

}
