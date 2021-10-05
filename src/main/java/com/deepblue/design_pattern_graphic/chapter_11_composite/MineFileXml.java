package com.deepblue.design_pattern_graphic.chapter_11_composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class MineFileXml extends MineFile {

	private String content;

	public MineFileXml(String name) {
		super(name);
	}

	public MineFileXml(String name, MineFile parent) {
		super(name, parent);
	}

	public MineFileXml(String name, MineFile parent, List<MineFile> children) {
		super(name, parent, children);
	}
}
