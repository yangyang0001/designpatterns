package com.deepblue.design_pattern_graphic.chapter_14_chain_of_responsibility;

public class Main {

	public static void main(String[] args) {
	    Support first = new FirstSupport();
	    Support secnd = new SecondSupport();
	    Support third = new ThirdSupport();
	    Trouble trouble = new Trouble("问题1");

	    first.setNext(secnd).setNext(third);
	    first.support(trouble);
	}
}
