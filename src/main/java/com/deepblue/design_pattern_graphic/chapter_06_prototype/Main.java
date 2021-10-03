package com.deepblue.design_pattern_graphic.chapter_06_prototype;

public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Product underlinePen = new UnderlinePen();
		Product messageBox = new MessageBox();
	    manager.register("underlinePen", underlinePen);
	    manager.register("messageBox", messageBox);

		Product clone1 = manager.createClone("underlinePen");
		Product clone2 = manager.createClone("messageBox");

		clone1.use("Hello   World");
		clone2.use("Design Patter");
	}
}
