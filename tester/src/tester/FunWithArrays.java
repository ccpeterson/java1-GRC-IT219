package tester;

import acm.program.*;

public class FunWithArrays extends ConsoleProgram {
	
	public void run() {
		String [] msg = {"No error", "No error", "No error"};
		println("contents of msg:");
		for(int i=0; i < msg.length; i++) {
			println(msg[i]);
		}
		resetAllMessages(msg);
		println("contents of msg:");
		for(int i=0; i < msg.length; i++) {
			println(msg[i]);
		}
	}
	
	public void resetAllMessages(String [] messages) {
		for (int i=0; i < messages.length; i++) {
			messages[i] = "Error!";
		}
	}

}
