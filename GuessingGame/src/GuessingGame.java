import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.event.*;

public class GuessingGame extends ConsoleProgram
{
	RandomGenerator rg = new RandomGenerator();
	final int ARRAY_SIZE = 5;
	int answers[] = new int[ARRAY_SIZE] ;
	int guess;
	boolean winner = false;	
	
	public void run() {
		setupAnswers();
		for(int i=0; i < ARRAY_SIZE; i++)
		{
			println(answers[i]);
		}
		println("Guess a number, 1 through 20");
		for (int i=0; i<3; i++) {
			guess = checkInput();
			checkAnswer(guess);
			if (winner == true) {
				break;
			}
		}
		if (winner == true) {
				println("you win");
			}
		else {
			println("you suck");
		}
	}
	
	public void setupAnswers() {
		for(int i=0; i < ARRAY_SIZE; i++)
		{
			answers[i] = getRandomPick();
		}
	}
	
	public int getRandomPick() {
		return rg.nextInt(1,20);		
	}
	
	public int checkInput() {
		while (true){
			int x = readInt("What's your guess: ");
			if (x>=1 && x <= 20){
				return x;				
			}
			else {
				println("sorry, thats not valid, try agin");
			}
		}	
	}
	
	public boolean checkAnswer(int x) {
		for(int i=0; i < ARRAY_SIZE; i++)
		{
			if (answers[i] == x) {
				winner = true;
			}			
		}
		return winner;
	}
}
