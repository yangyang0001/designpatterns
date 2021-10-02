package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_005_factory_method;

public interface MazeFactory {
    public MapSite createMaze();
    public MapSite createRoom(long roomNo);
    public MapSite createDoor(long fromRoomNo, long toRoomNo);
    public MapSite createWall();
 }
