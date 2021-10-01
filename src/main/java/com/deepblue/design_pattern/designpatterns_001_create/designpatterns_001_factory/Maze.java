package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_001_factory;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Maze {

    private List<Room> roomList = Lists.newArrayList();
}
