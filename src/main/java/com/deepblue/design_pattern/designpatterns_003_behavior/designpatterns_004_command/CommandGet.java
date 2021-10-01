package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_004_command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommandGet implements Command{
    private Receiver receiver;
    private SpecificExecutor executor;

    @Override
    public void execute() {
        receiver.setDocList(executor.getDocList());
    }
}
