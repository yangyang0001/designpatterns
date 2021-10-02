package com.deepblue.design_pattern_graphic.chapter_03_template.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CharParam extends Param {
	private char ch;
}
