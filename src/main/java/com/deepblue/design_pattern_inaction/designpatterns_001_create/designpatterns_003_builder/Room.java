package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_003_builder;

import com.deepblue.common.Direction;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Map;

@Data
@ToString
@Builder
public class Room extends MapSite {

    private long roomNo;

    private Map<Direction, MapSite> side;

    public Room() {}

    public Room(long roomNo) {
        this.roomNo = roomNo;
    }

    public Room(long roomNo, Map<Direction, MapSite> side) {
        this.roomNo = roomNo;
        this.side = side;
    }
}
