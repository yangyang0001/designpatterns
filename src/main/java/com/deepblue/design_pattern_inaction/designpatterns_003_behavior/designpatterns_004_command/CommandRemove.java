package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_004_command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommandRemove implements Command{
    private Receiver receiver;
    private SpecificExecutor executor;

    @Override
    public void execute() {
        Doc doc = new Doc();
        doc.setId(100L);
        executor.remove(doc);
        receiver.setDocList(executor.getDocList());
    }
}