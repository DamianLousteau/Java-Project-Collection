package passwordAuthenticator;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class passwordAuthenticator {

	public static void  (String[] args) {

		Scanner input = new Scanner(System.in);

		// Print out conditions.
		System.out.print(
				"Your password must contain: .\n" +
						"1.Only letters and digits.\n" +
						"2.At least 1 digit \n" +
						"3.Both passwords must match! \n" +
				"Input a password: \n");

		// Getting user input for both first and second password.
		String userInput = input.nextLine();
		System.out.println("Please enter in second password!");
		String secondInput = input.nextLine();

		// Creating a text file that stores user input/passwords.
		try {

			File file = new File ("Password.txt");
			FileWriter writer = new FileWriter(file);
			PrintWriter pw = new PrintWriter(writer);

			pw.println(userInput);
			
			pw.close();

		} catch (Exception e) {
			System.out.println("Error");
		}

		// If statement to validate the password of 1 digit and contains letters.
		if (validPassword(userInput)) {

			System.out.println("The passwords you have entered are valid: " + userInput + "\n");

			// This if statement them determines if the 2 passwords match.
			if(userInput.equals(secondInput) == true) {
				System.out.println("Passwords Match! Your new password has been created!");
			} else {
				System.out.println("Passwords do not match! Please Try Again!");
			}

		} else {
			System.out.println("Password may not contain any letters or numbers, Please try Agian!: " + userInput);
		}

	}

	
	// Method that determines id password is valid.
	public static boolean validPassword(String password) {

		if (password.length() < 0) {
			return false;
		}
		
		// Variables to count charters and numbers. 
		int charCount = 0;
		int numCount = 0;

		// For Loop to then run through the password and validate it with a if condition.
		for (int i = 0; i < password.length(); i++) {

			char ch = password.charAt(i);

			if (number(ch)) {
				numCount++;
			} else if (letter(ch)) {
				charCount++;
			} else {
				return false;
			}
		}
		return (charCount >= 2 && numCount >= 2);
	}

	// Method that then Puts everything to uppercase to determine charaters better.
	public static boolean letter(char ch) {

		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'Z');

	}

	// Method than then gets numbers and sees if the password will contain numbers from 0-9.
	public static boolean number(char ch) {

		return (ch >= '0' && ch <= '9');

	}








}
