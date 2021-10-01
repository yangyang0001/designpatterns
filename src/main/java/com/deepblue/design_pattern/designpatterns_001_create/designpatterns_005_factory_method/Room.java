package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_005_factory_method;

import com.deepblue.common.Direction;
import lombok.Data;
import lombok.ToString;

import java.util.Map;

@Data
@ToString
public class Room extends MapSite{

    private long roomNo;

    private Map<Direction, MapSite> side;

    public Room() {}

    public Room(long roomNo) {
        this.roomNo = roomNo;
    }

}
