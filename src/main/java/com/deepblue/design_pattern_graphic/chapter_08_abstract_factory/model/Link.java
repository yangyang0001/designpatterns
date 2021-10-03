package com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
public abstract class Link extends Item {

	protected String url;

	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}
}
