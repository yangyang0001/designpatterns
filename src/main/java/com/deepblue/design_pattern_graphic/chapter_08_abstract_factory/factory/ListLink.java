package com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.factory;

import com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model.Link;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
public class ListLink extends Link {

	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
	}
}
