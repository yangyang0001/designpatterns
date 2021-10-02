package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_009_singleton;

import com.deepblue.common.Direction;
import com.google.common.collect.Maps;

import java.util.Map;

public class Client {

    public static MazeSingleton createMazeSingleton() {

        WallSingleton wall1 = WallSingleton.getWallInstance();
        DoorSingleton door1 = DoorSingleton.getDoorInstance();

        door1.setFromRoomNo(1L);
        door1.setToRoomNo(-1L);

        RoomSingleton room1 = RoomSingleton.getRoomInstance();
        room1.setRoomNo(1L);

        Map<Direction, MapSite> roomSide1 = Maps.newHashMap();
        roomSide1.put(Direction.EAST, door1);
        roomSide1.put(Direction.WEST, wall1);
        roomSide1.put(Direction.SOUTH, wall1);
        roomSide1.put(Direction.NORTH, wall1);
        room1.setSide(roomSide1);

        MazeSingleton maze1 = MazeSingleton.getMazeInstance();

        WallSingleton wall2 = WallSingleton.getWallInstance();
        DoorSingleton door2 = DoorSingleton.getDoorInstance();
        RoomSingleton room2 = RoomSingleton.getRoomInstance();
        MazeSingleton maze2 = MazeSingleton.getMazeInstance();

//        System.out.println(wall1.hashCode() == wall2.hashCode());  true
//        System.out.println(door1.hashCode() == door2.hashCode());  true
//        System.out.println(room1.hashCode() == room2.hashCode());  true
//        System.out.println(maze1.hashCode() == maze2.hashCode());  true

        maze1.getRoomList().add(room1);
        return maze1;
    }

    public static void main(String[] args) {
        MazeSingleton mazeSingleton = Client.createMazeSingleton();
        System.out.println(mazeSingleton.toString());
    }
}
