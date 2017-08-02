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
	
	public void init(){
		setSize(WIN_WIDTH, WIN_HEIGHT);
		setBackground(Color.BLACK);
		
		
	}
	
	public void run() {
		createPlayfield();
	}
	
	public void createPlayfield() {
		rects = new GRect[4];
		rects[0] = new GRect(100,100,100,100);
		rects[0].setFillColor(Color.GRAY);
		rects[0].setFilled(true);
		add(rects[0]);
		rects[1] = new GRect(200,200,200,200);
		rects[1].setFillColor(Color.WHITE);
		rects[1].setFilled(true);
		add(rects[1]);
	}
}
