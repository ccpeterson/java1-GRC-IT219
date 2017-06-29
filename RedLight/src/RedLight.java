/*   IT219 -Demo ACM Animation*  P.Turylo 01/04/2017*/
import acm.program.*;
import acm.graphics.*;
import java.awt.*;
public class RedLight extends GraphicsProgram
{
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT =   400;
	public void run()
	{
		GRect r1 =  new GRect(60,120,20,55);
		add(r1);
		GOval o1 =  new GOval(65,125,10,10);
		add(o1);
		GOval o2 =  new GOval(65,140,10,10);
		add(o2);
		GOval o3 =  new GOval(65,155,10,10);
		add(o3);
		o1.setColor(Color.RED);
		o2.setColor(Color.YELLOW);
		o3.setColor(Color.GREEN);
		GRect r2 =  new GRect(90,120,20,55);
		add(r2);
		GOval o4 =  new GOval(95,125,10,10);
		add(o4);
		GOval o5 =  new GOval(95,140,10,10);
		add(o5);
		GOval o6 =  new GOval(95,155,10,10);
		add(o6);
		o4.setColor(Color.RED);
		o5.setColor(Color.YELLOW);
		o6.setColor(Color.GREEN);
		o1.setFilled(true);
		pause(1000);
		o1.setFilled(false);
		o2.setFilled(true);
		pause(1000);
		o2.setFilled(false);
		o3.setFilled(true);
		}
}
