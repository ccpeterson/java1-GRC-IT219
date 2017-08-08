package lander;

import java.awt.Color;
import java.awt.event.*;
import java.util.Random;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Lander1 extends GraphicsProgram {
	public static final int WIN_WIDTH = 800;
	public static final int WIN_HEIGHT = 600;
	
	public GOval circle;
	public int rateOfDecent = 0;
		
	public void init() {
		setSize(WIN_WIDTH, WIN_HEIGHT);
		setBackground(Color.WHITE);
	}
	public void run() {
		circle = new GOval(50,50,20,20);
		circle.setFillColor(Color.BLUE);
		circle.setFilled(true);
		add(circle);
		addKeyListeners();
		startGravity();
	}
	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
			case KeyEvent.VK_UP:
				rateOfDecent = rateOfDecent -10;
				break;
			case KeyEvent.VK_DOWN:
				circle.move(0, 10);
				break;
			case KeyEvent.VK_LEFT:
				circle.move(-10, 0);
				break;
			case KeyEvent.VK_RIGHT:
				circle.move(10, 0);
				break;
		}
	}
	public void startGravity() {
		while (true) {
			circle.move(0, rateOfDecent);
			rateOfDecent++;
			pause(100);
		}
	}

}
