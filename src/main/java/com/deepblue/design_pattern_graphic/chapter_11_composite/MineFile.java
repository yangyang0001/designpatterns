package com.deepblue.design_pattern_graphic.chapter_11_composite;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class MineFile {

	protected String name;

	protected MineFile parent;

	protected List<MineFile> children = Lists.newArrayList();

	public MineFile(String name) {
		this.name = name;
	}

	public MineFile(String name, MineFile parent) {
		this.name = name;
		this.parent = parent;
	}

	public MineFile(String name, MineFile parent, List<MineFile> children) {
		this.name = name;
		this.parent = parent;
		this.children = children;
	}
}
