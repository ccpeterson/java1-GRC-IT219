import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Pac1 extends GraphicsProgram 
{
    //Constants
    final int APP_WIDTH = 1600;
    final int APP_HEIGHT = 400;
  
	public void init()
	{
        //Set size of Applet
        setSize(APP_WIDTH,APP_HEIGHT);

        //Set Background color
        setBackground(Color.BLACK);
 	}
	public void run()
	{
		//setting size and initial location
		double size = 100;
		double x = size;
		double y = (getHeight()/2)-(size/2);
		//create initial PacMan
		GArc pac1 = new GArc(x, y, size, size, 45, 270);
		add(pac1);
		pac1.setFilled(true);
		pac1.setColor(Color.YELLOW);
		//move PacMan forever
		double startAngle = pac1.getStartAngle();
		double sweepAngle = pac1.getSweepAngle();
		while (true)
		{	
			// 3 motions to close, 3 to open
			for (int i=1; i<=6; i++)
			{
				if (i<=3)
				{
					startAngle = startAngle - 15;
					sweepAngle = sweepAngle + 30;
				}
				else
				{
					startAngle = startAngle + 15;
					sweepAngle = sweepAngle - 30;
				}
				pause(90);
				pac1.move(20,0);
				pac1.setStartAngle(startAngle);
				pac1.setSweepAngle(sweepAngle);
			}						
			//once it moves outside the screen move it back to the other side
			if (pac1.getX() >= APP_WIDTH)
			{
				pac1.setLocation(-size, (getHeight()/2)-(size/2)); 
			}
		}		
	}	
}
