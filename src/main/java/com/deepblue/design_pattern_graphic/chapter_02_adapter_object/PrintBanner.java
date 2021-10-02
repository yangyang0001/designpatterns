package com.deepblue.design_pattern_graphic.chapter_02_adapter_object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PrintBanner extends Print {

	private Banner banner;

	@Override
	public String showWeek(String param) {
		return banner.showWithParen(param);
	}

	@Override
	public String showStrong(String param) {
		return banner.showWithAster(param);
	}

}
