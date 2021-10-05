package com.deepblue.design_pattern_graphic.chapter_14_chain_of_responsibility;

public class FirstSupport extends Support {

	@Override
	public boolean resolve(Trouble trouble) {
		System.out.println("first  resolve failed");
		return false;
	}
}