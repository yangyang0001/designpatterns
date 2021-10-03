package com.deepblue.design_pattern_graphic.chapter_05_singleton;

public class Singleton {

	private static Singleton instance = new Singleton();

	private Singleton() {}

	public static Singleton getInstance() {
		return instance;
	}
}
