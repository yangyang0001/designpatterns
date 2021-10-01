package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_003_command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Document {

    private long id;
    private String documentName;

    public void open() {}

    public void close() {}

    public void cut() {}

    public Document copy() {
        return this;
    }

    public void paste() {}
}
