import java.awt.Color;

import acm.graphics.*;
import acm.util.*;
import acm.program.GraphicsProgram;

public class Asteroids extends GraphicsProgram{

	//Constants
    final int APP_WIDTH = 600;
    final int APP_HEIGHT = 600;
    
    
    //these have to be defined here so all the different methods can use them
    GPolygon asteroid1;
    GPolygon asteroid2;
    GPolygon asteroid3;
    
    //creating random gen
    RandomGenerator rg = new RandomGenerator( );
      
	public void init()
	{
        //Set size of Applet
        setSize(APP_WIDTH,APP_HEIGHT);

        //Set Background color
        setBackground(Color.GRAY);
 	}
	public void run()
	{
		createAsteroids();
	}
	public void createAsteroids(){
		asteroid1 = new GPolygon();
		asteroid1.setLocation(rg.nextInt(100, APP_WIDTH-100), rg.nextInt(100, APP_HEIGHT-100));
		asteroid1.addVertex(-30, 0);
		asteroid1.addVertex(0, 40);
		asteroid1.addVertex(30, 0);
		asteroid1.addVertex(0, -40);
		asteroid1.setFillColor(Color.DARK_GRAY);
		asteroid1.setFilled(true);
		add(asteroid1);
		asteroid2 = new GPolygon();
		asteroid2.setLocation(rg.nextInt(100, APP_WIDTH-100), rg.nextInt(100, APP_HEIGHT-100));
		asteroid2.addVertex(-30, 0);
		asteroid2.addVertex(0, 40);
		asteroid2.addVertex(30, 0);
		asteroid2.addVertex(0, -40);
		asteroid2.setFillColor(Color.DARK_GRAY);
		asteroid2.setFilled(true);
		add(asteroid2);
		asteroid3 = new GPolygon();
		asteroid3.setLocation(rg.nextInt(100, APP_WIDTH-100), rg.nextInt(100, APP_HEIGHT-100));
		asteroid3.addVertex(-30, 0);
		asteroid3.addVertex(0, 40);
		asteroid3.addVertex(30, 0);
		asteroid3.addVertex(0, -40);
		asteroid3.setFillColor(Color.DARK_GRAY);
		asteroid3.setFilled(true);
		add(asteroid3);
		

	}
}
