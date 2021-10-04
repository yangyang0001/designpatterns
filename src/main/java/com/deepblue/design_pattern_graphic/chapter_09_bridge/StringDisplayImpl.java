package com.deepblue.design_pattern_graphic.chapter_09_bridge;

public class StringDisplayImpl extends DisplayImpl {

	@Override
	public void display() {
		System.out.println("string display method invoking");
	}

	@Override
	public void mine_display() {
		System.out.println("string mine_display method invoking");
	}
}
