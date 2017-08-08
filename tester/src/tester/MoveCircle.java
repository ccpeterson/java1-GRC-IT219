package tester;

import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircle extends GraphicsProgram {
	
	private GOval circle;
	
	public void init()
	{
		circle = new GOval(50,50,20,20);
		circle.setFillColor(Color.BLUE);
		circle.setFilled(true);
		add(circle);
		addKeyListeners();
		
	}
	
	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
			case KeyEvent.VK_UP:
				circle.move(0, -100);
				break;
			case KeyEvent.VK_DOWN:
				circle.move(0, 100);
				break;
			case KeyEvent.VK_LEFT:
				circle.move(-3, 100);
				break;
			case KeyEvent.VK_RIGHT:
				circle.move(3, 100);
				break;
		}
	}
	
	
	
	
	

}