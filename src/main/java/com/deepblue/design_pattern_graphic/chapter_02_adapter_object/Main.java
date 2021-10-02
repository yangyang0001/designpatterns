package com.deepblue.design_pattern_graphic.chapter_02_adapter_object;

public class Main {

	public static void main(String[] args) {
		Print print = new PrintBanner(new Banner());
		String week   = print.showWeek("Hello");
		String strong = print.showStrong("Hello");
		System.out.println("object week   is : " + week);
		System.out.println("object strong is : " + strong);
	}

}
