package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_007_prototype;

import com.deepblue.common.Direction;
import lombok.Data;
import lombok.ToString;

import java.util.Map;

@Data
@ToString
public class Room extends MapSite implements Cloneable{
    private long roomNo;
    private Map<Direction, MapSite> side;
}
