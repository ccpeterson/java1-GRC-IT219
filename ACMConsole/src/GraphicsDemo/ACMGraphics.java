package GraphicsDemo;

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class ACMGraphics extends GraphicsProgram {
	public static final int APLLICATION_WIDTH = 400;
	public static final int APLLICATION_HEIGHT = 400;
	
	public void run()
	{
		GOval ball = new GOval(50,50,400,400);
		ball.setColor(Color.red);
		ball.setFilled(true);
		add(ball);
	}
}
