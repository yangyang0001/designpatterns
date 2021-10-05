package com.deepblue.design_pattern_graphic.chapter_22_command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {

	private MacroCommand history = new MacroCommand();

	private DrawCanvas canvas = new DrawCanvas(400, 400, history);

	private JButton clearButton = new JButton("clear");

	// 构造函数
	public Main(String title) {
		super(title);
		this.addWindowListener(this);
		canvas.addMouseMotionListener(this);
		clearButton.addActionListener(this);

		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);

		Box mainBox = new Box(BoxLayout.X_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);

		getContentPane().add(mainBox);

		pack();
		show();
	}

	// ActionListener 接口中的方法
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clearButton) {
			history.clear();
			canvas.repaint();
		}
	}

	// MouseMotionListener 接口中的方法
	@Override
	public void mouseDragged(MouseEvent e) {
		Command command = new DrawCommand(canvas, e.getPoint());
		history.append(command);
		command.execute();
	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}


	// WindowListener 中的方法
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}


	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}


	public static void main(String[] args) {
	    new Main("Command Pattern Sample");
	}




}
