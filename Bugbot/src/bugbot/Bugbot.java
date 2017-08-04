package bugbot;

import java.awt.*;
import java.awt.event.*;

import acm.graphics.*;
import acm.util.*;
import acm.program.*;

public class Bugbot extends GraphicsProgram {
	
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
	
	public void createPlayfield() {
		rects = new GRect[4];
		rects[0] = new GRect(400,0,50,200);
		rects[0].setFillColor(Color.GREEN);
		rects[0].setFilled(true);
		add(rects[0]);
		rects[1] = new GRect(200,200,50,50);
		rects[1].setFillColor(Color.ORANGE);
		rects[1].setFilled(true);
		add(rects[1]);
		rects[2] = new GRect(200,400,100,200);
		rects[2].setFillColor(Color.BLUE);
		rects[2].setFilled(true);
		add(rects[2]);
		rects[3] = new GRect(600,500,100,100);
		rects[3].setFillColor(Color.CYAN);
		rects[3].setFilled(true);
		add(rects[3]);
		ovals = new GOval[4];
		ovals[0] = new GOval(100,100,50,50);
		ovals[0].setFillColor(Color.GREEN);
		ovals[0].setFilled(true);
		add(ovals[0]);
		ovals[1] = new GOval(500,250,50,50);
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
		boolean collision = false;
		while (collision == false) {
			bug.move(5,0);
			GRectangle bounds = bug.getBounds();
			for (int i=0; i<4; i++) {
				if (bounds == rects[i].getBounds()) {
					collision = true;
					break;
				}
			}
			for (int i=0; i<4; i++) {
					if (bounds == rects[i].getBounds()) {
						collision = true;
						break;
					}
			}			
			pause(50);
		}
	}
}
