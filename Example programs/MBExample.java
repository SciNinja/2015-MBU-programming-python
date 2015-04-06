// This is an example program
// written by Wataru Coram

//For the Programming Merit Badge,
//I need to make a program, and debug it, in three
//different languages. Python will be a first. Java will be a second.
//This is a program that asks your name and age. It also asks
//whether it is correct.

import java.util.Scanner;

public class MBExample {
    public static void main(String[] args) {
	    Scanner user_input = new Scanner(System.in);
		
		System.out.println("Hi!");
		
		String name; // asks for name
		System.out.print("What is your name? ");
		name = user_input.next();
		
		String age; // asks for age
		System.out.print("What is your age? ");
		age = user_input.next();
		
		String msg;
		msg = "Your name is " + name + " and your age is " + age;
		System.out.println("" + msg);
		
		boolean valid = false;
		
		while (valid == false) { // while not valid
		    String correct;
			System.out.print("If this is correct, enter yes. If not, enter no. ");
			correct = user_input.next();
			if (correct.equals("yes")) { // if the user input is 'yes'
			    valid = true;	
			}
			else if (correct.equals("no")) { // if the user input is 'no'
			    valid = true;
			}
			else { // if the user input is totally irrelevent to the question
			    System.out.println("That is not a valid answer. You typed '" + correct + "'. Try again.");
				// var valid is still false
			}
		} // end while loop
	} // end method
} // end class