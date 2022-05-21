// Robert Calero
// User Input - Java Application

import java.util.*;

public class UserInput
	{
		public static void main(String args[])
			{
				Scanner input = new Scanner(System.in);				// Scanner variable to get user input
				
				String userName;									// String declaration
				int userAge;										// Variable declaration of type int
				double userSalary;									// Variable declaration of type double
				
				System.out.println("User Input Examples: ");		// Writes text to the console and goes to the next line
				System.out.print("What is your name: ");			// Writes text to the console
				userName = input.nextLine();						// Console awaits user input and assigns the string value to a variable
				
				System.out.print("What is your age: ");				// Writes text to the console and and goes to the next line
				userAge = input.nextInt();							// Console awaits user input, converts the integer value entered to a string and assigns the value to a variable
				
				System.out.print("What is your salary: ");			// Writes text to the console and goes to the next line
				userSalary = input.nextDouble();					// Console awaits user input, converts the double value entered to a string and assigns the value to a variable
				
				System.out.println();								// Goes to the next line
				
				System.out.println("Your name is: " + userName);	// Writes text to the console and value of a variable and goes to the next line
				System.out.println("Your age is: " + userAge);		// Writes text to the console and value of a variable and goes to the next line
				System.out.print("Your salary is: " + userSalary);	// Writes text to the console and value of a variable
				input.close();
			}
	}