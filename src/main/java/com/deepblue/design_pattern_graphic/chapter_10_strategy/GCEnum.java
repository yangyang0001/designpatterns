package com.deepblue.design_pattern_graphic.chapter_10_strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 此例子中只定义 新生代的垃圾回收器 做策略值 就可以演示策略模式了
 */
public enum GCEnum {

	GC_SERIAL(1, "原始垃圾回收器"),
	GC_PARNEW(2, "并行垃圾回收器"),
	GC_PARALL(3, "吞吐垃圾回收器");

	private Integer code;
	private String  desc;

	GCEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
}
