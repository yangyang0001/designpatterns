package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_009_singleton;

import com.deepblue.common.Direction;
import com.google.common.collect.Maps;
import lombok.Data;
import lombok.ToString;

import java.util.Map;

@Data
@ToString
public class RoomSingleton extends MapSite {

    private long roomNo;
    private Map<Direction, MapSite> side = Maps.newHashMap();

    private RoomSingleton() {}

    private static class RoomSingletonHandler {
        private static RoomSingleton room = new RoomSingleton();
        public static RoomSingleton getRoomInstance() {
            return room;
        }
    }

    public static RoomSingleton getRoomInstance() {
        return RoomSingletonHandler.getRoomInstance();
    }
}
