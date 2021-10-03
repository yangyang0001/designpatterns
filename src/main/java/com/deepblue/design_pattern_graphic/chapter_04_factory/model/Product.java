package com.deepblue.design_pattern_graphic.chapter_04_factory.model;

import com.alibaba.fastjson.JSON;

public class Product {
	public void show() {
		System.out.println(JSON.toJSONString(this));
	}
}
