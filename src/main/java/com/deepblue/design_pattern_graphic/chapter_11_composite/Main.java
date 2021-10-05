package com.deepblue.design_pattern_graphic.chapter_11_composite;

import com.alibaba.fastjson.JSON;

public class Main {

	public static void main(String[] args) {

		MineFile root = new MineFile("root");
		MineFile bin = new MineFile("usr");
		MineFile tmp = new MineFile("tmp");
		MineFile etc = new MineFile("etc");
		root.getChildren().add(bin);
		root.getChildren().add(tmp);
		root.getChildren().add(etc);

		MineFile vi = new MineFile("vi");
		MineFile latex = new MineFile("latex");
		bin.getChildren().add(vi);
		bin.getChildren().add(latex);

		MineFile html = new MineFile("diary.html");
		MineFile doc = new MineFile("game.doc");
		MineFile email = new MineFile("junk.email");
		etc.getChildren().add(html);
		etc.getChildren().add(doc);
		etc.getChildren().add(email);

		System.out.println(JSON.toJSONString(root));
	}
}
