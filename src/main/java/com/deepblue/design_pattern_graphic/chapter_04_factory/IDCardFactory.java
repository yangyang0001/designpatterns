package com.deepblue.design_pattern_graphic.chapter_04_factory;

import com.deepblue.design_pattern_graphic.chapter_04_factory.model.IDCard;
import com.deepblue.design_pattern_graphic.chapter_04_factory.model.IDCardParam;
import com.deepblue.design_pattern_graphic.chapter_04_factory.model.Param;
import com.deepblue.design_pattern_graphic.chapter_04_factory.model.Product;

public class IDCardFactory extends Factory {

	@Override
	public Product create(Param param) {
		IDCardParam cardParam = (IDCardParam) param;
		String username = cardParam.getUsername();
		IDCard card = new IDCard(username);
		return card;
	}
}
