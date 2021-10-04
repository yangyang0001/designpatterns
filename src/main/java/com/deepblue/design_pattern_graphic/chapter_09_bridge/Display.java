package com.deepblue.design_pattern_graphic.chapter_09_bridge;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Display {

	private DisplayImpl displayImpl;

	public void display() {
		displayImpl.display();
	}

	public void mine_display() {
		displayImpl.mine_display();
	}

}
