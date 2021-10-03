package com.deepblue.design_pattern_graphic.chapter_04_factory;

import com.deepblue.design_pattern_graphic.chapter_04_factory.model.IDCardParam;
import com.deepblue.design_pattern_graphic.chapter_04_factory.model.Product;

public class Main {

	public static void main(String[] args) {

		Factory factory = new IDCardFactory();
		Product card1 = factory.create(new IDCardParam("张三"));
		Product card2 = factory.create(new IDCardParam("李四"));
		Product card3 = factory.create(new IDCardParam("王五"));

		card1.show();
		card2.show();
		card3.show();
	}
}
