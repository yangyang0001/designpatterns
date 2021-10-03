package com.deepblue.design_pattern_graphic.chapter_08_abstract_factory;

import com.alibaba.fastjson.JSON;
import com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.factory.Factory;
import com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model.Link;
import com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model.Page;
import com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model.Tray;

public class Main {

	public static void main(String[] args) {
		Factory factory = Factory.createFactory("com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.factory.ListFactory");

		Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
		Link guangm = factory.createLink("光明日报", "http://www.gmw.cn/");

		Link google = factory.createLink("Google", "http://www.google.com/");
		Link dunian = factory.createLink("BaiDu", "http://www.baidu.com/");

		Tray traynews = factory.createTray("日报");
		traynews.add(people);
		traynews.add(guangm);

		Tray traysear = factory.createTray("搜索引擎");
		traysear.add(google);
		traysear.add(dunian);

		Page page = factory.createPage("LinkPage","杨建伟");
		page.add(traynews);
		page.add(traysear);

		System.out.println("page :" + JSON.toJSONString(page));

		page.output();
	}
}
