package com.deepblue.design_pattern_graphic.chapter_03_template;

import com.deepblue.design_pattern_graphic.chapter_03_template.model.Param;
import com.deepblue.design_pattern_graphic.chapter_03_template.model.StringParam;

public class StringDisplayServiceImpl extends DisplayServiceImpl implements StringDisplayService {

	@Override
	public void open() {
		System.out.println("+-------------------------------------------+");
	}

	@Override
	public void print(Param param) {
		StringParam stringParam = (StringParam) param;
		String string = stringParam.getStr();
		System.out.println("|--------------- " + string + " ---------------|");
	}

	@Override
	public void close() {
		System.out.println("+-------------------------------------------+");
	}
}
