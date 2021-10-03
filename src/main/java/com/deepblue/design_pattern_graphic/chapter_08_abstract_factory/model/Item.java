package com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
public abstract class Item {

	protected String caption;

	public Item(String caption) {
		this.caption = caption;
	}

	public abstract String makeHTML();
}
