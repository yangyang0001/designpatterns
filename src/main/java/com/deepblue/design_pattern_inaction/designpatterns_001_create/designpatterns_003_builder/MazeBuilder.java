package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_003_builder;

public interface MazeBuilder {

    public MapSite createMaze();

    public MapSite createRoom(long roomNo);

    public MapSite createDoor(long fromRoomNo, long toRoomNo);

    public MapSite createWall();

}
