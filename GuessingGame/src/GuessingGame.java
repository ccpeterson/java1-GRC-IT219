// header goes here

import acm.program.*;
import acm.util.RandomGenerator;
public class GuessingGame extends ConsoleProgram
{
	//windows size constants
	final int WIDTH = 800;
	final int HEIGHT = 500;	
	//create a constants for the array size, range of numbers, and number of guesses	
	final int ARRAY_SIZE = 5;
	final int MIN_RANGE = 1;
	final int MAX_RANGE = 20;
	final int GUESS_ATTEMPTS = 3;	
	//create a random number generator name rg
	RandomGenerator rg = new RandomGenerator();	
	//declare variables so they can be used globally
	int answers[] = new int[ARRAY_SIZE] ;
	int guess;
	boolean winner = false;	
	//init so we can resize the window
	public void init()
	{
		setSize(WIDTH, HEIGHT);
	}		
	public void run() {
		//setup the array with random numbers
		setupAnswers();		
		//this prints the array so we can see the answers while we create it
		/*
		for(int i=0; i < ARRAY_SIZE; i++)
		//{
			println(answers[i]);
		}
		*/		
		//welcomes users and explains the game
		println("Hey there, this is a guessing game.");
		println("I have thought of " + ARRAY_SIZE + " numbers between (and including) " + MIN_RANGE + " and " + MAX_RANGE + ".");
		println("You have " + GUESS_ATTEMPTS + " chances to guess one of them.");
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
				println ("Sorry no. you have " + (GUESS_ATTEMPTS - 1 - i) + " guesses left" );
			}
		}
		//using the same variable to see if the win or lose message is displayed
		if (winner == true) {
				println("Yay, you did it, congrats.");
			}
		else {
			println("You are out of guesses, too bad.");
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
			// readInt already makes sure the input is a valid int without crashing
			int x = readInt("What's your guess: ");
			//this if makes sure the number picked is within the right range
			if (x>=MIN_RANGE && x <= MAX_RANGE){
				return x;				
			}
			else {
				println("Please pick a number within the range specified.");
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