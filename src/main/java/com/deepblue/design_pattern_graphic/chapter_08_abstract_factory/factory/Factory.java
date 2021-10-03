package com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.factory;

import com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model.Link;
import com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model.Page;
import com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model.Tray;

public abstract class Factory {

	public static Factory createFactory(String className) {
		Factory factory = null;
		try {
		    factory = (Factory) Class.forName(className).newInstance();
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return factory;
	}

	public abstract Link createLink(String caption, String url);

	public abstract Tray createTray(String caption);

	public abstract Page createPage(String title, String author);
}
