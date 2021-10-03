package com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.factory;

import com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model.Link;
import com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model.Page;
import com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model.Tray;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}
}
