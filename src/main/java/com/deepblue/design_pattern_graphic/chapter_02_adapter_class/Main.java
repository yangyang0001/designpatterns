package com.deepblue.design_pattern_graphic.chapter_02_adapter_class;

public class Main {

	public static void main(String[] args) {
		Print print = new PrintBanner();
		String week   = print.showWeek("Hello");
		String strong = print.showStrong("Hello");
		System.out.println("class week   is : " + week);
		System.out.println("class strong is : " + strong);
	}
}
