/* IT219 Demo for showing animation, setting object properties 
*       and trying to detect collisions.
*  P.Turylo 01/09/2017
*/
package GraphicsDemo;

//import packages


import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class AnimationDemo extends GraphicsProgram
{
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 400;
	
	public void run()
	{	

		//variables to track score, locations, and movement
		int score = 0;
		int ufoMove = 10;
		int spitBallMove = -5;
		int ufoLocation = 0;
		int spitBallLocation = 0;
		
		//create a label to track score
		String msg = "Score is " + score;
		GLabel label1 = new GLabel(msg,10,390);
		label1.setFont("Serif-BOLD-60");
		add(label1);
				
		//create spitball
		GOval o1 = new GOval(  5,5);
		add(o1,300,300);
		o1.setColor(Color.RED);
		o1.setFilled(true);
		
		//create UFO
		GOval o2 = new GOval(100,20);
		add(o2,10,10);
		o2.setColor(Color.green);
		o2.setFilled(true);
		
		//wait for user
		waitForClick();
		
	
		while(true)		
		{
			pause(10);
						
			//figure out where ufo and ball are
			ufoLocation = (int)o2.getX();
			spitBallLocation = (int)o1.getY();
			
			//if collision possible then update score
			if (spitBallLocation <= 30 && ufoLocation >= 200)
			{
				score = score + 1;
				msg = "Score is " + score;
				label1.setLabel(msg);
			}
	
			//make UFO and spitball repeat movements
			if (ufoLocation == 290)
			{
				ufoMove = -10;
			}
			else if(ufoLocation == 10)
			{
				ufoMove = 10;
			}
			if(spitBallLocation == 10)
			{
				spitBallMove = 5;
			}	
			else if(spitBallLocation == 300)
			{
				spitBallMove = -5;
			}
			o2.move(ufoMove,0);
			o1.move(0,spitBallMove);
		}

	}

	
}
