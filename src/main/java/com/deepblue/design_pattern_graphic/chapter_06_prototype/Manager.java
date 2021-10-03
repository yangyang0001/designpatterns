package com.deepblue.design_pattern_graphic.chapter_06_prototype;

import com.google.common.collect.Maps;

import java.util.Map;

public class Manager {

	private Map<String, Product> productMap = Maps.newHashMap();

	public void register(String name, Product product) {
		productMap.put(name, product);
	}

	public Product createClone(String name) {
		Product product = productMap.get(name);
		return product.createClone();
	}

}
