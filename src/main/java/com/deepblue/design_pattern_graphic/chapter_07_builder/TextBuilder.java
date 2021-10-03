package com.deepblue.design_pattern_graphic.chapter_07_builder;

public class TextBuilder extends Builder {

	private StringBuffer buffer = new StringBuffer();

	@Override
	public void makeTitle(String title) {
		buffer.append("=======================================\n");
		buffer.append("『" + title + "』\n");
		buffer.append("\n");
	}

	@Override
	public void makeItem(String item) {
		buffer.append("■ " + item + "\n");
		buffer.append("\n");
	}

	@Override
	public void makeContent(String content) {
		buffer.append("    " + content + "\n");
		buffer.append("\n");
	}

	@Override
	public void close() {
		buffer.append("=======================================\n");
	}

	public String getResult() {
		return buffer.toString();
	}
}
