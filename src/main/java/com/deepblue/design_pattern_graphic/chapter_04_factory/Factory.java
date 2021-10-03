package com.deepblue.design_pattern_graphic.chapter_04_factory;

import com.deepblue.design_pattern_graphic.chapter_04_factory.model.Param;
import com.deepblue.design_pattern_graphic.chapter_04_factory.model.Product;

public abstract class Factory {

	public abstract Product create(Param param);
}
