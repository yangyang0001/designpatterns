package com.deepblue.designpatterns_001_create.designpatterns_007_prototype;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Maze extends MapSite implements Cloneable{
    private List<Room> roomList = Lists.newArrayList();
}
