package com.deepblue.design_pattern_graphic.chapter_10_strategy;

public class ParallGCStrategy extends GCStrategy{
	@Override
	public void gc() {
		System.out.println("parallel scavenge gc invoking");
	}
}
