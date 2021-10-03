package com.deepblue.design_pattern_graphic.chapter_04_factory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IDCardParam extends Param {

	private String username;

}
