package com.deepblue.design_pattern_graphic.chapter_03_template;

import com.deepblue.design_pattern_graphic.chapter_03_template.model.CharParam;
import com.deepblue.design_pattern_graphic.chapter_03_template.model.Param;

public class CharDisplayServiceImpl extends DisplayServiceImpl implements CharDisplayService {

	@Override
	public void open() {
		System.out.print("<<");
	}

	@Override
	public void print(Param param) {
		CharParam charParam = (CharParam) param;
		char ch = charParam.getCh();
		System.out.print(ch);
	}

	@Override
	public void close() {
		System.out.println(">>");
	}
}
