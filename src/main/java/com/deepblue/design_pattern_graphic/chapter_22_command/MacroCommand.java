package com.deepblue.design_pattern_graphic.chapter_22_command;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command {

	private Stack commands = new Stack();

	@Override
	public void execute() {
		Iterator iterator = commands.iterator();
		while(iterator.hasNext()) {
			((Command) iterator.next()).execute();
		}
	}

	// 添加命令
	public void append(Command command) {
		if (command != null && command != this) {
			commands.push(command);
		}
	}

	// 移除最后一条命令
	public void undo() {
		if(!commands.isEmpty()) {
			commands.pop();
		}
	}

	// 清除所有命令
	public void clear() {
		commands.clear();
	}
}
