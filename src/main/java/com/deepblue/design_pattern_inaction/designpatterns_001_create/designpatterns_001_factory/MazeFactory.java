package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_001_factory;

public class MazeFactory {

    public Maze createMaze() {
        return new Maze();
    }

    public Room createRoom(long roomNo) {
        return new Room(roomNo);
    }

    public Wall createWall() {
        return new Wall();
    }

    public Door createDoor(Room room1, Room room2) {
        return new Door(room1.getRoomNo(), room2.getRoomNo());
    }
}
