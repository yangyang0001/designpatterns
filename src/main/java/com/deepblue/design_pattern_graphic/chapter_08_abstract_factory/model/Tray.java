package com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public abstract class Tray extends Item {

	protected List<Item> tray = Lists.newArrayList();

	public Tray(String caption) {
		super(caption);
	}

	public void add(Item item) {
		tray.add(item);
	}

}
