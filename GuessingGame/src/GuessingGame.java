import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.event.*;

public class GuessingGame extends ConsoleProgram
{
	//create a random number generator name rg
	RandomGenerator rg = new RandomGenerator();
	//create a constants for the array size, range of numbers, and number of guesses	
	final int ARRAY_SIZE = 5;
	final int MIN_RANGE = 1;
	final int MAX_RANGE = 20;
	final int GUESS_ATTEMPTS = 3;
	//declare variables so they can be used globally
	int answers[] = new int[ARRAY_SIZE] ;
	int guess;
	boolean winner = false;	
	
	public void run() {
		//setup the array with random numbers
		setupAnswers();
		//this prints the array so we can see the answers while we create it
		for(int i=0; i < ARRAY_SIZE; i++)
		{
			println(answers[i]);
		}
		//welcomes users and explains the game
		println("Guess a number, " + MIN_RANGE + " through " + MAX_RANGE);
		//give the user a number of attempts to guess the right number
		for (int i=0; i<GUESS_ATTEMPTS; i++) {
			//asks for a number as a guess and checks it
			guess = checkInput();
			//checks the guess
			checkAnswer(guess);
			//the checking method will turn winner to true so it breaks the loop
			if (winner == true) {
				break;
			}
			else if (GUESS_ATTEMPTS - 1 - i > 0) {
				println ("sorry no. you have " + (GUESS_ATTEMPTS - 1 - i) + " guesses left" );
			}
		}
		//using the same variable to see if the win or lose message is displayed
		if (winner == true) {
				println("you win");
			}
		else {
			println("you suck");
		}
	}
	
	//the fills the array with random numbers
	public void setupAnswers() {
		for(int i=0; i < ARRAY_SIZE; i++)
		{
			answers[i] = getRandomPick();
		}
	}
	
	// a method to pick a random number within the range specified
	public int getRandomPick() {
		return rg.nextInt(MIN_RANGE,MAX_RANGE);		
	}
	// a method to ensure the guesses are within the range they are supposed to be
	// will return the number if it's valid, otherwise will loop until the users picks a good one 
	public int checkInput() {
		while (true){
			int x = readInt("What's your guess: ");
			if (x>=MIN_RANGE && x <= MAX_RANGE){
				return x;				
			}
			else {
				println("please pick a number within the range specified.");
			}
		}	
	}
	// a method that takes the guess and compares it to all the numbers in the array, will flip the winner variable
	public void checkAnswer(int x) {
		for(int i=0; i < ARRAY_SIZE; i++)
		{
			if (answers[i] == x) {
				winner = true;
			}			
		}
	}
}
