package com.deepblue.design_pattern_graphic.chapter_02_adapter_object;

/**
 * 现有状况
 */
public class Banner {

	public String showWithParen(String param) {
		return "(" + param + ")";
	}

	public String showWithAster(String param) {
		return "*" + param + "*";
	}
}
