package com.deepblue.design_pattern_graphic.chapter_06_prototype;

public class MessageBox extends Product {

	@Override
	public void use(String param) {
		System.out.println("+-------------------------+");
		System.out.println("|------" + param + "------+");
		System.out.println("+-------------------------+");
	}
}
