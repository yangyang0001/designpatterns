package com.deepblue.design_pattern_graphic.chapter_22_command;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {

	// 颜色
	private Color color = Color.red;

	// 要绘制的圆点的半径
	private int radius = 6;

	// 命令的历史记录
	private MacroCommand history;

	// 构造函数
	public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width, height);
		setBackground(Color.WHITE);
		this.history = history;
	}

	// 重新绘制
	public void paint(Graphics graphics) {
		history.execute();
	}

	// 绘制
	@Override
	public void draw(int x, int y) {
		Graphics graphics = getGraphics();
		graphics.setColor(color);
		graphics.fillOval(x - radius, y - radius, radius * 2, radius * 2);
	}
}
