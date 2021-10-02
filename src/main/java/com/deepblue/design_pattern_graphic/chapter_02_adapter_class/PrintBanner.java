package com.deepblue.design_pattern_graphic.chapter_02_adapter_class;

public class PrintBanner extends Banner implements Print {

	@Override
	public String showWeek(String param) {
		return this.showWithParen(param);
	}

	@Override
	public String showStrong(String param) {
		return this.showWithAster(param);
	}

}
