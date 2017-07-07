/*
  Demo program to display use of GArc class objects.
  P.Turylo 01/22/2017
*/


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
	 	
		double size = 100;
		double x = size;
		double y = (getHeight() - size) / 2;
		 
		//create initial PacManJr
		GArc pac1 = new GArc(x, y, size, size, 45, 270);
		add(pac1);
		pac1.setFilled(true);
		pac1.setColor(Color.YELLOW);
		
		//move PacManJr around
		int go = 0;
		while (go < 5)
		{
			pause(100);
			pac1.move(30,0);
			pac1.setStartAngle(30 );
			pac1.setSweepAngle(300);
			pause(100);
			pac1.move(30,0);
			pac1.setStartAngle(15 );
			pac1.setSweepAngle(330);
			pause(100);
			pac1.move(30,0);
			pac1.setStartAngle(0 );
			pac1.setSweepAngle(360);
			pause(100);
			pac1.move(30,0);
			pac1.setStartAngle(15 );
			pac1.setSweepAngle(330);
			pause(100);
			pac1.move(30,0);
			pac1.setStartAngle(30 );
			pac1.setSweepAngle(300);
			pause(100);
			pac1.move(30,0);
			pac1.setStartAngle(45 );
			pac1.setSweepAngle(270);
			go++;
		}
		





		
		
	}

	
	
}
