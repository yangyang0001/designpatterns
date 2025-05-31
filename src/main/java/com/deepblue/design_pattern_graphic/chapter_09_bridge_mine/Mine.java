package com.deepblue.design_pattern_graphic.chapter_09_bridge_mine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Mine {

    private MineHandler handler;

    public void minePrint() {
        handler.print();
    }




}
