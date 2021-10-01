package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_004_command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Doc {
    private long id;
    private String docName;
}
