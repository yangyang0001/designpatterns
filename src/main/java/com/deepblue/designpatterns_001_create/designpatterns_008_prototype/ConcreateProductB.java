package com.deepblue.designpatterns_001_create.designpatterns_008_prototype;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ConcreateProductB extends AbstractProduct implements Cloneable {
    private String bProperty;
}
