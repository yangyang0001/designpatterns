package com.deepblue.design_pattern_graphic.chapter_03_template;

import com.deepblue.design_pattern_graphic.chapter_03_template.model.Param;

public abstract class DisplayServiceImpl implements DisplayService {

	public abstract void open();

	public abstract void print(Param param);

	public abstract void close();

	@Override
	public void display(Param param) {
		open();
		for(int i = 0; i < 5; i++) {
			print(param);
		}
		close();
	}
}
