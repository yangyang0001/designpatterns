package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_001_factory;

import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Door extends MapSite{

    private long fromRoomNo;
    private long toRoomNo;

}
