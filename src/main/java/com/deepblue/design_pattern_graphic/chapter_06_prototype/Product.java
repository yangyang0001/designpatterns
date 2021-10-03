package com.deepblue.design_pattern_graphic.chapter_06_prototype;

import com.alibaba.fastjson.JSON;

public abstract class Product implements Cloneable{

	public abstract void use(String param);

	public Product createClone() {
		Product product = null;
		try {
			product = (Product) this.clone();
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return product;
	}
}
