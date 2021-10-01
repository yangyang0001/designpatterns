package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_007_prototype;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MapSite implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
