package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_004_command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommandAdd implements Command {
    private Receiver receiver;
    private SpecificExecutor executor;

    @Override
    public void execute() {
        Doc doc1 = new Doc();
        doc1.setId(100L);
        doc1.setDocName("docName1");
        Doc doc2 = new Doc();
        doc2.setId(200L);
        doc2.setDocName("docName2");
        executor.add(doc1);
        executor.add(doc2);

        receiver.setDocList(executor.getDocList());
    }
}
