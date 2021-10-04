package com.deepblue.design_pattern_graphic.chapter_10_strategy;

public class Main {

	public static void main(String[] args) {
		GCStrategy strategy = null;
	    GCEnum gcEnum = GCEnum.GC_PARALL;
	    if(GCEnum.GC_SERIAL.getCode().intValue() == gcEnum.getCode().intValue()) {
			strategy = new SerialGCStrategy();
		} else if (GCEnum.GC_PARNEW.getCode().intValue() == gcEnum.getCode().intValue()) {
			strategy = new ParNewGCStrategy();
		} else if (GCEnum.GC_PARALL.getCode().intValue() == gcEnum.getCode().intValue()) {
			strategy = new ParallGCStrategy();
		} else {
			System.err.println("there has no this strategy gc");
			return;
		}
	    strategy.gc();
	}
}
