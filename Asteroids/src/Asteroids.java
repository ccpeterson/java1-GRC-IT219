import java.awt.Color;
import java.awt.event.*;
import acm.graphics.*;
import acm.util.*;
import acm.program.GraphicsProgram;

public class Asteroids extends GraphicsProgram
{
	//Constants
    final int APP_WIDTH = 600;
    final int APP_HEIGHT = 600;
    
    //these have to be defined here so all the different methods can use them
    GPolygon asteroid1;
    GPolygon asteroid2;
    GPolygon asteroid3;
    GLabel scoreBoard;
    
    int score;
    
    //creating random gen
    RandomGenerator rg = new RandomGenerator( );
      
	public void init()
	{
        //Set size of Applet
        setSize(APP_WIDTH,APP_HEIGHT);

        //Set Background color
        setBackground(Color.GRAY);
        
        addMouseListeners();
 	}
	public void mousePressed(MouseEvent e)
	{
		double x = e.getX();
		double y = e.getY();
		GObject theObject = getElementAt(x, y);
		if (theObject == asteroid1)
		{
			asteroid1.setVisible(false);
			score ++;
			scoreBoard.setLabel("Current Score -" + score);
		}
		if (theObject == asteroid2)
		{
			asteroid2.setVisible(false);
			score ++;
			scoreBoard.setLabel("Current Score -" + score);
		}
		if (theObject == asteroid3)
		{
			asteroid3.setVisible(false);
			score ++;
			scoreBoard.setLabel("Current Score -" + score);
		}
	}	
	public void run()
	{
		createAsteroids();
		createScoreboard();
		moveAsteroids();
	}
	public void createAsteroids()
	{
		asteroid1 = new GPolygon();
		asteroid1.setLocation(-100, rg.nextInt(100, APP_HEIGHT-100));
		asteroid1.addVertex(-30, 0);
		asteroid1.addVertex(0, 40);
		asteroid1.addVertex(30, 0);
		asteroid1.addVertex(0, -40);
		asteroid1.setFillColor(Color.DARK_GRAY);
		asteroid1.setFilled(true);
		add(asteroid1);
		asteroid2 = new GPolygon();
		asteroid2.setLocation(-100, rg.nextInt(100, APP_HEIGHT-100));
		asteroid2.addVertex(-30, 0);
		asteroid2.addVertex(0, 40);
		asteroid2.addVertex(30, 0);
		asteroid2.addVertex(0, -40);
		asteroid2.setFillColor(Color.DARK_GRAY);
		asteroid2.setFilled(true);
		add(asteroid2);
		asteroid3 = new GPolygon();
		asteroid3.setLocation(-100, rg.nextInt(100, APP_HEIGHT-100));
		asteroid3.addVertex(-30, 0);
		asteroid3.addVertex(0, 40);
		asteroid3.addVertex(30, 0);
		asteroid3.addVertex(0, -40);
		asteroid3.setFillColor(Color.DARK_GRAY);
		asteroid3.setFilled(true);
		add(asteroid3);
	}
	public void createScoreboard()
	{
		scoreBoard = new GLabel("Current Score -" + score);
		scoreBoard.setLocation(APP_WIDTH/2, 100);
		add(scoreBoard);
		
	}
	public void moveAsteroids()
	{
		int x1 = rg.nextInt(10,15);
		int x2 = rg.nextInt(10,15);
		int x3 = rg.nextInt(10,15);
		while(true)
		{
			pause(50);
			asteroid1.move(x1,0);
			asteroid2.move(x2,0);
			asteroid3.move(x3,0);
			if (asteroid1.getX() >= (APP_WIDTH +100) )
			{
				asteroid1.setLocation(-100, rg.nextInt(100, APP_HEIGHT-100));
				asteroid1.setVisible(true);
				
			}
			if (asteroid2.getX() >= (APP_WIDTH +100) )
			{
				asteroid2.setLocation(-100, rg.nextInt(100, APP_HEIGHT-100));
				asteroid2.setVisible(true);
			}
			if (asteroid3.getX() >= (APP_WIDTH +100) )
			{
				asteroid3.setLocation(-100, rg.nextInt(100, APP_HEIGHT-100));
				asteroid3.setVisible(true);
			}
		}
	}
}
