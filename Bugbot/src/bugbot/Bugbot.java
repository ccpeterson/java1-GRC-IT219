package bugbot;

import java.awt.Color;
import java.util.Random;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Bugbot extends GraphicsProgram {
	//window size
	public static final int WIN_WIDTH = 800;
	public static final int WIN_HEIGHT = 600;
	
	
	
	GRect[] rects;
	GOval[] ovals;
	GLabel target;
	GCompound bug = new GCompound();
	
	public void init(){
		setSize(WIN_WIDTH, WIN_HEIGHT);
		setBackground(Color.WHITE);
	}
	
	public void run() {
		createPlayfield();
		addBug();
		moveBug();
	}

	// used to decide to turn left or right randomly
	public boolean getRandomBoolean() {
	    Random random = new Random();
	    return random.nextBoolean();
	}
	
	public void createPlayfield() {
		rects = new GRect[5];
		rects[0] = new GRect(450,0,50,250);
		rects[0].setFillColor(Color.GREEN);
		rects[0].setFilled(true);
		add(rects[0]);
		rects[1] = new GRect(200,250,50,50);
		rects[1].setFillColor(Color.ORANGE);
		rects[1].setFilled(true);
		add(rects[1]);
		rects[2] = new GRect(200,400,100,200);
		rects[2].setFillColor(Color.BLUE);
		rects[2].setFilled(true);
		add(rects[2]);
		rects[3] = new GRect(500,500,300,100);
		rects[3].setFillColor(Color.CYAN);
		rects[3].setFilled(true);
		add(rects[3]);
		rects[4] = new GRect(50,50,WIN_WIDTH-100,WIN_HEIGHT-100);
		rects[4].setVisible(false);
		rects[4].setFilled(false);
		rects[4].sendToBack();
		add(rects[4]);
		ovals = new GOval[4];
		ovals[0] = new GOval(100,100,150,50);
		ovals[0].setFillColor(Color.GREEN);
		ovals[0].setFilled(true);
		add(ovals[0]);
		ovals[1] = new GOval(600,100,50,50);
		ovals[1].setFillColor(Color.ORANGE);
		ovals[1].setFilled(true);
		add(ovals[1]);
		ovals[2] = new GOval(400,400,50,50);
		ovals[2].setFillColor(Color.BLUE);
		ovals[2].setFilled(true);
		add(ovals[2]);
		ovals[3] = new GOval(700,300,50,50);
		ovals[3].setFillColor(Color.RED);
		ovals[3].setFilled(true);
		add(ovals[3]);
		target = new GLabel("X",725,325);
		target.setColor(Color.WHITE);
		add(target);
	}
	public void addBug() {
		GOval bug1 = new GOval(0,0,50,50);
		bug1.setFillColor(Color.BLACK);
		bug1.setFilled(true);
		bug.add(bug1);
		add(bug,50,300);				
	}
	public void moveBug() {
		//starts the bug moving to the right
		int direction = 1;
		while (true) {
			//the 4 directions of travel
			if (direction == 1) {
				bug.move(5,0);
			}
			if (direction == 2) {
				bug.move(0,5);
			}
			if (direction == 3) {
				bug.move(-5,0);
			}
			if (direction == 4) {
				bug.move(0,-5);
			}
			//this checks to see if the bug has his one of the rectangles
			for (int i = 0; i < 4; i++) {
				if (bug.getBounds().intersects(rects[i].getBounds())) {
					if (direction == 1) {
						bug.move(-20, 0);
						if (getRandomBoolean() == true) {
							direction = 2;
						}
						else {
							direction = 4;
						}
					}
					else if (direction == 2) {
						bug.move(0, -20);
						if (getRandomBoolean() == true) {
							direction = 3;
						}
						else {
							direction = 1;
						}
					}
					else if (direction == 3) {
						bug.move(20, 0);
						if (getRandomBoolean() == true) {
							direction = 4;
						}
						else {
							direction = 2;
						}
					}
					else if (direction == 4) {
						bug.move(0, 20);
						if (getRandomBoolean() == true) {
							direction = 1;
						}
						else {
							direction = 3;
						}
					}
				}
			}
			//this checks to see if the bug has his one of the ovals, besides the target
			for (int i = 0; i < 3; i++) {
				if (bug.getBounds().intersects(ovals[i].getBounds())) {
					if (direction == 1) {
						bug.move(-20, 0);
						if (getRandomBoolean() == true) {
							direction = 2;
						}
						else {
							direction = 4;
						}
					}
					else if (direction == 2) {
						bug.move(0, -20);
						if (getRandomBoolean() == true) {
							direction = 3;
						}
						else {
							direction = 1;
						}
					}
					else if (direction == 3) {
						bug.move(20, 0);
						if (getRandomBoolean() == true) {
							direction = 4;
						}
						else {
							direction = 2;
						}
					}
					else if (direction == 4) {
						bug.move(0, 20);
						if (getRandomBoolean() == true) {
							direction = 1;
						}
						else {
							direction = 3;
						}
					}
				}
			}
			//this turns the bug around when it hits the edges
			if (!bug.getBounds().intersects(rects[4].getBounds())) {
			
				if (direction == 1) {
					direction = 3;
				}
				else if (direction == 2) {
					direction = 4;
				}
				else if (direction == 3) {
					direction = 1;
				}
				else if (direction == 4) {
					direction = 2;
				}
			}
			//this breaks the while loop when the bug hits the target
			if (bug.getBounds().intersects(ovals[3].getBounds())) {
				break;
			}
			pause(20);
		}
	}
}
