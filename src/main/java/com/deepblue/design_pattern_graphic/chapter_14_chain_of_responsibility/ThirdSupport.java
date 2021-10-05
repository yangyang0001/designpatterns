package com.deepblue.design_pattern_graphic.chapter_14_chain_of_responsibility;

public class ThirdSupport extends Support {

	@Override
	public boolean resolve(Trouble trouble) {
		System.out.println("third  resolve success");
		return true;
	}
}
