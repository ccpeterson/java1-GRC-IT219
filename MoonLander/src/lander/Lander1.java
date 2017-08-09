package lander;

import java.awt.Color;
import java.awt.event.*;
import java.util.Random;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Lander1 extends GraphicsProgram {
	//window size
	public static final int WIN_WIDTH = 800;
	public static final int WIN_HEIGHT = 600;
	//downward speed added every frame
	public static final int GRAVITY = 1;
	//refresh rate
	public static final int REFRESH_RATE = 50;
	//upward speed added every click
	public static final int THRUST = 10;
	public GImage lander;
	public int rateOfDecent = 0;
	
		
	public void init() {
		setSize(WIN_WIDTH, WIN_HEIGHT);
		setBackground(Color.WHITE);
	}
	
	public void run() {
		addLander();
		printStartGame();
		playGame();
	}
	
	public void addLander() {
		lander = new GImage("lander.JPG");
		lander.setBounds(WIN_WIDTH/2, 100, 100, 75);
		add(lander);		
	}
	
	public void mouseMoved(MouseEvent e) {
		if ((e.getX() < getWidth() ) && (e.getX() > 0)) {
			lander.setLocation(e.getX() , lander.getY());
		}		
	}
	
	public void mousePressed(MouseEvent e) {
		rateOfDecent = rateOfDecent - THRUST;
	}
	
	public void startGravity() {
		while (true) {
			lander.move(0, rateOfDecent);
			rateOfDecent = rateOfDecent + GRAVITY;
			pause(REFRESH_RATE);
		}
	}
	
	public void playGame() {
		waitForClick();
		addMouseListeners();
		startGravity();		
	}
	
	public void printStartGame() {
		GLabel startGame = new GLabel ("Click to start", getWidth()/2, getHeight()/2);
		// startGame.move(-startGame.getWidth()/2, -startGame.getHeight());
		startGame.setColor(Color.RED);
		add (startGame);
		waitForClick();
		remove (startGame);
	}
	
	public void printGameOver() {
		GLabel gameOver = new GLabel ("Game Over", getWidth()/2, getHeight()/2);
		gameOver.setColor(Color.RED);
		add (gameOver);
	}	
	
	public void printWinner() {
		GLabel Winner = new GLabel ("Winner!!", getWidth()/2, getHeight()/2);
		Winner.setColor(Color.RED);
		add (Winner);
	}

}
