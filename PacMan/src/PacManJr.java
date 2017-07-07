/*
  Demo program to display use of GArc class objects.
  P.Turylo 01/22/2017
*/


import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;


public class PacManJr extends GraphicsProgram 
{
    //Constants
    final int APP_WIDTH = 600;
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
	 	
		double size = 200;
		double x = (getWidth() - size) / 2;
		double y = (getHeight() - size) / 2;
	
		//create initial PacManJr
		GArc arc = new GArc(x, y, size, size, 45, 270);
		add(arc);
		arc.setFilled(true);
		arc.setColor(Color.YELLOW);
		
		//move PacManJr around
		pause(200);
		arc.move(50,0);
		arc.setStartAngle(15 );
		arc.setSweepAngle(330);





		
		
	}

	
	
}
