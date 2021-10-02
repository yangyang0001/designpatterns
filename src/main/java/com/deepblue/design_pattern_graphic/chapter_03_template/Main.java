package com.deepblue.design_pattern_graphic.chapter_03_template;

import com.deepblue.design_pattern_graphic.chapter_03_template.model.CharParam;
import com.deepblue.design_pattern_graphic.chapter_03_template.model.Param;
import com.deepblue.design_pattern_graphic.chapter_03_template.model.StringParam;

public class Main {

	public static void main(String[] args) {
		DisplayService charService = new CharDisplayServiceImpl();
		Param charParam = new CharParam('A');
		charService.display(charParam);

		DisplayService stringService = new StringDisplayServiceImpl();
		Param stringParam = new StringParam("Hello World");
		stringService.display(stringParam);
	}

}
