package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_008_prototype;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ConcreateProductA extends AbstractProduct implements Cloneable {
    private String aProperty;
}
