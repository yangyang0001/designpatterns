package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_007_prototype;

import com.deepblue.common.Direction;
import com.google.common.collect.Maps;

import java.util.Map;

public class MazeClient {

    public static Maze createMaze(Maze mazePrototype, Room roomPrototype, Door doorPrototype, Wall wallPrototype) throws CloneNotSupportedException{
        Maze maze = (Maze) mazePrototype.clone();

        Room room1 = (Room) roomPrototype.clone();
        room1.setRoomNo(1L);
        Room room2 = (Room) roomPrototype.clone();
        room2.setRoomNo(2L);

        Door door = (Door) doorPrototype.clone();
        Wall wall = (Wall) wallPrototype.clone();

        Map<Direction, MapSite> roomSide1 = Maps.newHashMap();
        roomSide1.put(Direction.EAST, door);
        roomSide1.put(Direction.WEST, wall);
        roomSide1.put(Direction.SOUTH, wall);
        roomSide1.put(Direction.NORTH, wall);
        room1.setSide(roomSide1);

        Map<Direction, MapSite> roomSide2 = Maps.newHashMap();
        roomSide2.put(Direction.EAST, wall);
        roomSide2.put(Direction.WEST, door);
        roomSide2.put(Direction.SOUTH, wall);
        roomSide2.put(Direction.NORTH, wall);
        room2.setSide(roomSide2);

        maze.getRoomList().add(room1);
        maze.getRoomList().add(room2);

        return maze;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Maze maze = MazeClient.createMaze(new Maze(), new Room(), new Door(), new Wall());
        maze.getRoomList().stream().forEach(System.out::println);
    }
}
