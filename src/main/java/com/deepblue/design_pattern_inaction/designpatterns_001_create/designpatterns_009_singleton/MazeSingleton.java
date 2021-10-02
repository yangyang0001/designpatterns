package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_009_singleton;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.ToString;

import java.util.List;


@Data
@ToString
public class MazeSingleton extends MapSite {

    private MazeSingleton() {}

    private List<RoomSingleton> roomList = Lists.newArrayList();

    private static class MazeSingletonHandler {
        private static MazeSingleton maze = new MazeSingleton();
        public static MazeSingleton getMazeInstance() {
            return maze;
        }
    }

    public static MazeSingleton getMazeInstance() {
        return MazeSingletonHandler.getMazeInstance();
    }

}
