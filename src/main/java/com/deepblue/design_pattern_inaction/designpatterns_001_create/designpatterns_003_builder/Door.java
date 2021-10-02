package com.deepblue.design_pattern_inaction.designpatterns_001_create.designpatterns_003_builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Door extends MapSite {
    private long fromRoomNo;
    private long toRoomNo;
}
