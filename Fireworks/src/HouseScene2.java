import acm.program.GraphicsProgram;
import acm.graphics.*;
import java.awt.Color;
import javax.swing.*;

public class HouseScene2 extends GraphicsProgram
{
	final int WIDTH = 800;
	final int HEIGHT = 500;
	final Color PURPLE = new Color(100, 0, 100);

	public void init()
	{
		setSize(WIDTH, HEIGHT);
		setBackground(Color.CYAN);
	}

	public void run()
	{
		drawHouse();
		drawScenery();
		drawFence(20);

	} //end of run method

	public void drawHouse()
	{
		//Draw house
		GRect house = new GRect(100, 300, 150, 100);
		add(house);
		house.setFilled(true);
		house.setFillColor(Color.YELLOW);
		house.setColor(Color.YELLOW);

		drawDoor();
		drawRoof(PURPLE);
		drawWindow(PURPLE, "medium");
	}

	public void drawRoof(Color roofColor)
	{
		//Draw roof
		GPolygon roof = new GPolygon();
		roof.addVertex(100, 300);
		roof.addVertex(175, 250);
		roof.addVertex(250, 300);
		roof.setFilled(true);
		roof.setColor(roofColor);
		add(roof);
	}

	public void drawDoor()
	{
		//Draw door
		GRect door = new GRect(120, 330, 30, 85);
		door.setFilled(true);
		door.setColor(Color.RED);
		door.setFillColor(Color.RED);
		add(door);
	}

	public void drawScenery()
	{
		drawSun();
		drawCloud(200, 100);
		drawCloud(300, 150);
		drawCloud(250, 120);
		drawGrass();
	}

	public void drawSun()
	{
		//Draw sun
		GOval sun = new GOval(50, 50, 80, 80);
		sun.setFilled(true);
		sun.setColor(Color.ORANGE);
		add(sun);
	}

	public void drawCloud(int xLoc, int yLoc)
	{
		//Draw cloud
		GCompound cloud = new GCompound();

		GOval cloud1 = new GOval(10, 0, 30, 20);
		cloud1.setFilled(true);
		cloud1.setColor(Color.WHITE);
		cloud.add(cloud1);

		GOval cloud2 = new GOval(0, 5, 20, 10);
		cloud2.setFilled(true);
		cloud2.setColor(Color.WHITE);
		cloud.add(cloud2);

		GOval cloud3 = new GOval(30, 5, 20, 10);
		cloud3.setFilled(true);
		cloud3.setColor(Color.WHITE);
		cloud.add(cloud3);

		add(cloud, xLoc, yLoc);
	}

	public void drawGrass()
	{
		//Draw grass
		GRect grass = new GRect(0, 375,
								WIDTH,
								HEIGHT - 375);
		add(grass);
		grass.setFilled(true);
		grass.setFillColor(Color.GREEN);
		grass.setColor(Color.GREEN);
	}

	public void drawFence(int numPickets)
	{
		//Draw fence
		int xCoord = 175;
		for (int i=0; i<numPickets; i++)
		{
			GRect picket = new GRect (xCoord, 350, 10, 30);
			picket.setFillColor(Color.WHITE);
			picket.setFilled(true);
			add(picket);
			xCoord = xCoord + 15;
		}
	}

	public void drawWindow(Color windowColor, String size)
	{
		int width, height;

		if (size.equalsIgnoreCase("small"))
		{
			width = 10;
			height = 10;
		}
		else if (size.equalsIgnoreCase("medium"))
		{
			width = 12;
			height = 12;
		}
		else
		{
			width = 15;
			height = 15;
		}

		GRect window = new GRect(200, 320, width, height);
		window.setFilled(true);
		window.setColor(windowColor);
		add(window);

	}

} //end of class