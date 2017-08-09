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
	public GRect target;
	public int rateOfDecent = 0;
			
	public void init() {
		setSize(WIN_WIDTH, WIN_HEIGHT);
		setBackground(Color.WHITE);
	}	
	public void run() {
		setupGame();
		printStartGame();
		playGame();
		printGameOver();
	}	
	public void setupGame() {
		addTarget();
		addLander();
	}	
	public void addLander() {
		lander = new GImage("lander.JPG");
		lander.setBounds(WIN_WIDTH/2, 100, 100, 75);
		add(lander);		
	}	
	public void addTarget() {
		target = new GRect(WIN_WIDTH/2,WIN_HEIGHT-50,200,20);
		target.setFillColor(Color.GRAY);
		target.setFilled(true);
		add(target);
	}	
	public void mouseMoved(MouseEvent e) {
		if ((e.getX() < getWidth() ) && (e.getX() > 0)) {
			lander.setLocation(e.getX() , lander.getY());
		}		
	}	
	public void mousePressed(MouseEvent e) {
		rateOfDecent = rateOfDecent - THRUST;
	}	
	public void playGame() {
		waitForClick();
		addMouseListeners();
		startGravity();		
	}	
	public void startGravity() {
		while (true) {
			lander.move(0, rateOfDecent);
			if (checkCollision()==true) {
				printWinner();
				break;
			}
			rateOfDecent = rateOfDecent + GRAVITY;
			pause(REFRESH_RATE);
		}
	}
	public boolean checkCollision() {
		if (lander.getY()+lander.getHeight() >= target.getY()) {
			if (lander.getX() > target.getX() && lander.getX()+lander.getWidth() < target.getX() + target.getWidth()) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
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