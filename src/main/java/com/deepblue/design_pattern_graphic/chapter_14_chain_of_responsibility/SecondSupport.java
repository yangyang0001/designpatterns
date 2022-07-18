package com.deepblue.design_pattern_graphic.chapter_14_chain_of_responsibility;

public class SecondSupport extends Support {

	@Override
	public boolean resolve(Trouble trouble) {
		System.out.println("second support resolve ...");
		return false;
	}
}