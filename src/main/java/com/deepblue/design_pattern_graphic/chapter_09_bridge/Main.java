package com.deepblue.design_pattern_graphic.chapter_09_bridge;

public class Main {

	public static void main(String[] args) {
		Display count = new CountDisplay();
		count.display();

		Display strin = new Display(new StringDisplayImpl());
		strin.display();
		strin.mine_display();
	}
}
