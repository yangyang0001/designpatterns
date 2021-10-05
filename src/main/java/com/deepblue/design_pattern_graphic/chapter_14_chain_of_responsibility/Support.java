package com.deepblue.design_pattern_graphic.chapter_14_chain_of_responsibility;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

public abstract class Support {

	public Support next;

	public abstract boolean resolve(Trouble trouble);

	public final void support(Trouble trouble) {
		if(resolve(trouble)) {
			System.out.println("trouble is resolved");
		} else if (next != null) {
			next.support(trouble);
		} else {
			System.out.println("trouble is failed");
		}
	}

	public Support setNext(Support next) {
		this.next = next;
		return next;
	}
}
