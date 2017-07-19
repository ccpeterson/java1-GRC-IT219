package tester;

import acm.program.*;

public class TestOverload extends ConsoleProgram{

	public void run(){
		welcomeMessage();
		welcomeMessage("some guy");
		welcomeMessage("some", "girl");
	}
	private void welcomeMessage(){
		println("Welcome!");
	}
	private void welcomeMessage(String fullname){
		println("Welcome " + fullname + "!");
	}
	private void welcomeMessage(String firstname, String lastname){
		println("Welcome " + firstname + " " + lastname + "!");
	}
	
}
