package com.deepblue.design_pattern_graphic.chapter_09_bridge_mine;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

        Mine mine1 = new Mine(new MineStringHandler("zhangsan", "name is a zhangsan"));

        mine1.minePrint();

        Mine mine2 = new Mine(new MineStringHandler("lisi", "name is lisi"));

        mine2.minePrint();

        MineCount count = new MineCount(new MineStringHandler("wangswu", "wangwu is a student!"));

        count.countPrint(2);




    }
}
