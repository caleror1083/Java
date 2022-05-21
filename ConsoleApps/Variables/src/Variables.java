// Robert Calero
// Variables - Java Application

public class Variables
	{
		public static void main(String args[])
			{
				// Numbers - Integers
				byte myByte = 1;																		// Variable declaration and initialization of type byte
				short myShort = 2;																		// Variable declaration and initialization of type short
				int myInt = 3;																			// Variable declaration and initialization of type int
				long myLong = 4;																		// Variable declaration and initialization of type long
				
				// Numbers - Real Numbers
				double myDouble = 5.9;																	// Variable declaration and initialization of type double
				float myFloat = 6.5F;																	// Variable declaration and initialization of type float
				
				// Characters
				char myChar = 'A';																		// Variable declaration and initialization of type char
				String myString = "This is a string";													// String declaration and initialization
				
				// Logical
				boolean myBool = true;																	// Variable declaration and initialization of type boolean
				
				// Assigning values to a variable
				double myUnvaluedDouble;																// Variable declaration of type double
				myUnvaluedDouble = 5.29;																// Assigning a value to a variable that was not initialized when declared
				
				System.out.println("Variable Examples: ");												// Writes text to the console and goes to the next line
				System.out.println("Byte data type: " + myByte);										// Writes text to the console and value of a variable and goes to the next line
				System.out.println("Short data type: " + myShort);										// Writes text to the console and value of a variable and goes to the next line
				System.out.println("Int data type: " + myInt);											// Writes text to the console and value of a variable and goes to the next line
				System.out.println("Long data type: " + myLong);										// Writes text to the console and value of a variable and goes to the next line
				System.out.println("Double data type: " + myDouble);									// Writes text to the console and value of a variable and goes to the next line
				System.out.println("Float data type: " + myFloat);										// Writes text to the console and value of a variable and goes to the next line
				System.out.println("Char data type: " + myChar);										// Writes text to the console and value of a variable and goes to the next line
				System.out.println(myString);															// Writes value of a variable and goes to the next line
				System.out.println("Boolean data type: " + myBool);										// Writes text to the console and value of a variable and goes to the next line
				System.out.print("Double that was not initialized when declared: " + myUnvaluedDouble);	// Writes text to the console and value of a variable
			}
	}