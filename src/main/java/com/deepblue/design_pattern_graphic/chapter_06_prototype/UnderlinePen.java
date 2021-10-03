package com.deepblue.design_pattern_graphic.chapter_06_prototype;

public class UnderlinePen extends Product {

	@Override
	public void use(String param) {
		System.out.println(param);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	}
}
