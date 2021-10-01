package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_007_prototype;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Door extends MapSite implements Cloneable{
    private long fromRoomNo;
    private long toRoomNo;
}
