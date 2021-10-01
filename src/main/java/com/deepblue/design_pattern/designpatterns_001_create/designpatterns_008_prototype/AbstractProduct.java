package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_008_prototype;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AbstractProduct implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected long productNo;

    private String productName;
}
