package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_005_factory_method;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Door extends MapSite{
    private long fromRoomNo;
    private long toRoomNo;

    public Door() {}

    public Door(long fromRoomNo, long toRoomNo) {
        this.fromRoomNo = fromRoomNo;
        this.toRoomNo = toRoomNo;
    }
}
