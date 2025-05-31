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
public class MineStringHandler extends MineHandler  {

    private String title;
    private String content;


    @Override
    public void print() {

        System.out.println("MineStringHandler print invoke, title   is :" + this.getTitle());
        System.out.println("MineStringHandler print invoke, content is :" + this.getContent());

    }
}
