package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_001_factory;

import com.deepblue.common.Direction;
import com.google.common.collect.Maps;

import java.util.*;

public class Client {

    public static Maze createMaze(MazeFactory factory) {

        Maze maze = factory.createMaze();

        Room room1 = factory.createRoom(1L);
        Room room2 = factory.createRoom(2L);

        Wall wall = factory.createWall();
        Door door = factory.createDoor(room1, room2);

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

    public static void main(String[] args) {
        MazeFactory factory = new MazeFactory();
        Maze maze = Client.createMaze(factory);
        List<Room> roomList = maze.getRoomList();
        roomList.stream().forEach(System.out::println);
    }
}
