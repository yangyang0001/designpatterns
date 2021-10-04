package com.deepblue.design_pattern_graphic.chapter_10_strategy;

public class ParNewGCStrategy extends GCStrategy {
	@Override
	public void gc() {
		System.out.println("parnew gc invoking");
	}
}
