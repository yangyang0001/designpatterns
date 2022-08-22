package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_003_builder;

import com.deepblue.common.Direction;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 这里的导向器Director 就是 Client 类,代替Director
 * 思考：
 *      一个Director 可以有 n 个生产产品的方法, 同样Builder 可以有 n 个！
 * 总结：
 *      AbstractDirector ConcreteDirector AbstractBuilder ConcreteBuilder Product Client 组成
 */
public class Client {

    public static Maze createMaze(MazeBuilder mazeBuilder) {
        Maze maze = (Maze) mazeBuilder.createMaze();
        Room room1 = (Room) mazeBuilder.createRoom(1);
        Room room2 = (Room) mazeBuilder.createRoom(2);
        Door door = (Door) mazeBuilder.createDoor(room1.getRoomNo(), room2.getRoomNo());
        Wall wall = (Wall) mazeBuilder.createWall();


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
        Maze maze = Client.createMaze(new MazeBuilder() {
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

        System.out.println(maze);
    }
}
