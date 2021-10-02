package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_005_factory_method;

import com.alibaba.fastjson.JSON;
import com.deepblue.common.Direction;
import com.google.common.collect.Maps;

import java.util.Map;

public class Client {

    public static Maze createMaze(MazeFactory factory) {
        Maze maze = (Maze) factory.createMaze();
        Room room1 = (Room) factory.createRoom(1L);
        Room room2 = (Room) factory.createRoom(2L);
        Door door = (Door) factory.createDoor(room1.getRoomNo(), room2.getRoomNo());
        Wall wall = (Wall) factory.createWall();

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
        Maze maze = Client.createMaze(new MazeFactory() {
            @Override
            public MapSite createMaze() {
                return new Maze();
            }
            @Override
            public MapSite createRoom(long roomNo) {
                return new Room(roomNo);
            }
            @Override
            public MapSite createDoor(long fromRoomNo, long toRoomNo) {
                return new Door(fromRoomNo, toRoomNo);
            }
            @Override
            public MapSite createWall() {
                return new Wall();
            }
        });

        System.out.println(JSON.toJSONString(maze.getRoomList()));
    }
}
