package com.deepblue.design_pattern_graphic.chapter_04_factory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IDCard extends Product {
	private String username;
}
