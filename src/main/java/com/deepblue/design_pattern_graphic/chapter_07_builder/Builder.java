package com.deepblue.design_pattern_graphic.chapter_07_builder;

public abstract class Builder {
	public abstract void makeTitle(String title);
	public abstract void makeItem(String item);
	public abstract void makeContent(String content);
	public abstract void close();
	public abstract String getResult();
}
