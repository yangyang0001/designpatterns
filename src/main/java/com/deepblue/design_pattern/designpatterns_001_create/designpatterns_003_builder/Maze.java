package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_003_builder;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Maze extends MapSite {
    private List<Room> roomList = Lists.newArrayList();
}
