package com.deepblue.design_pattern_graphic.chapter_07_builder;

public class Main {

	public static void main(String[] args) {
		Builder textBuilder = new TextBuilder();
		Director director = new Director(textBuilder);
		director.construct();
		String result = textBuilder.getResult();
		System.out.println(result);
	}
}
