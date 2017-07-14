import acm.program.GraphicsProgram;
import acm.graphics.*;
import java.awt.Color;
import javax.swing.*;

public class HouseScene1 extends GraphicsProgram
{
	final int WIDTH = 800;
	final int HEIGHT = 500;

	public void init()
	{
		setSize(WIDTH, HEIGHT);
		setBackground(Color.CYAN);
	}

	public void run()
	{
		//Draw house
		GRect house = new GRect(100, 300, 150, 100);
		add(house);
		house.setFilled(true);
		house.setFillColor(Color.YELLOW);
		house.setColor(Color.YELLOW);

		//Draw roof
		GPolygon roof = new GPolygon();
		roof.addVertex(100, 300);
		roof.addVertex(175, 250);
		roof.addVertex(250, 300);
		roof.setFilled(true);
		roof.setColor(Color.DARK_GRAY);
		add(roof);

		//Draw door
		GRect door = new GRect(120, 330, 30, 85);
		door.setFilled(true);
		door.setColor(Color.RED);
		door.setFillColor(Color.RED);
		add(door);

		//Draw sun
		GOval sun = new GOval(50, 50, 80, 80);
		sun.setFilled(true);
		sun.setColor(Color.ORANGE);
		add(sun);

		//Draw grass
		GRect grass = new GRect(0, 375,
								WIDTH,
								HEIGHT - 375);
		add(grass);
		grass.setFilled(true);
		grass.setFillColor(Color.GREEN);
		grass.setColor(Color.GREEN);

		//Draw cloud



		//Draw fence




	}
}