package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_009_singleton;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class DoorSingleton extends MapSite {

    private long fromRoomNo;
    private long toRoomNo;

    private DoorSingleton() {}

    private static class DoorSingletonHandler {
        private static DoorSingleton door = new DoorSingleton();
        public static DoorSingleton getDoorInstance() {
            return door;
        }
    }

    public static DoorSingleton getDoorInstance() {
        return DoorSingletonHandler.getDoorInstance();
    }

}
