/*
 * WelcomeUser.java
 * Demo program for variables, console input, and output.
 * P.Turylo 06/29/2017
 */


package greeting;

import acm.program.*;

public class welcomeUser extends ConsoleProgram {
	
	public void run()
	{
		println("The Greeting Program");
		String firstName = readLine("Enter your name: ");
		println("Your first name is :" + firstName);
		println();
		println("Let's add numbers!");
		int num1 = readInt("First Number: ");
		int num2 = readInt("Second Number: ");
		int total = num1 + num2;
		print("The total is " + total);
		
	}

}
