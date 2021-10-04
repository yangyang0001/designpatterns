package com.deepblue.design_pattern_graphic.chapter_10_strategy;

public class SerialGCStrategy extends GCStrategy {
	@Override
	public void gc() {
		System.out.println("serial gc invoking");
	}
}
