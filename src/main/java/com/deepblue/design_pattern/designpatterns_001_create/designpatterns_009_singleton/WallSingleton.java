package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_009_singleton;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class WallSingleton extends MapSite {

    private WallSingleton() {}

    private static class WallSingletonHandler {
        private static WallSingleton wall = new WallSingleton();
        public static WallSingleton getWallInstance() {
            return wall;
        }
    }

    public static WallSingleton getWallInstance() {
        return WallSingletonHandler.getWallInstance();
    }
}
