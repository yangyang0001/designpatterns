package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_003_command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PasteCommand implements Command {

    private ApplicationView view;

    private Document document;

    @Override
    public void execute() {
        document.paste();
    }

}
