package com.deepblue.design_pattern_graphic.chapter_07_builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Director {

	private Builder builder;

	public void construct() {
		builder.makeTitle("全天新闻联播");
		builder.makeItem("早间新闻");
		builder.makeContent("大家早上好, 今天早上在...");
		builder.makeItem("午间新闻");
		builder.makeContent("大家中午好, 就在今天中午12点...");
		builder.close();
	}
}
