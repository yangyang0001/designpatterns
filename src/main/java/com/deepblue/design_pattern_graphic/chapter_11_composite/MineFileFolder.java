package com.deepblue.design_pattern_graphic.chapter_11_composite;


import java.util.List;

public class MineFileFolder extends MineFile {

	public MineFileFolder(String name) {
		super(name);
	}

	public MineFileFolder(String name, MineFile parent) {
		super(name, parent);
	}

	public MineFileFolder(String name, MineFile parent, List<MineFile> children) {
		super(name, parent, children);
	}
}
