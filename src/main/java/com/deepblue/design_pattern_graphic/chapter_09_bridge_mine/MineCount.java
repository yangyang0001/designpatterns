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
public class MineCount extends Mine{

    private MineHandler handler;

    public void minePrint() {
        handler.print();
    }

    public void countPrint(int param) {
        System.out.println("MineCount countPrint method invoke start...............................");
        for(int i = 0; i < param; i++) {
            this.minePrint();
        }
        System.out.println("MineCount countPrint method invoke end  ...............................");

    }




}
