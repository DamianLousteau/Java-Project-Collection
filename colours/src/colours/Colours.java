package colours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Colours {

	public static void main(String[] args) {
		
		// Scanner for userInput
		Scanner userInput = new Scanner(System.in);

		// ArrayLists to store both names and colours given from input. (Please understand that the lists must be equal in length as instructed).
		List<String> names = new ArrayList<String>();
		List<String> colours = new ArrayList<String>();
		
		// While Loop that then asks the user input multiple times.
		while(true){
			System.out.println("Please enter your name: ");
			names.add(userInput.next());
			System.out.println("Please enter your number: ");
			colours.add(userInput.next());

			System.out.println("Do you want to add a directory yes/no?");
			String answer = userInput.next(); 
			
			// The user can then break when enough names and colours have been added.
			if (answer.equals("no")) {
				System.out.println("Thanks for adding to the directory");
				System.out.println(answer);
				System.out.println(names);
				System.out.println(colours);
				
				// Using collections to shuffle the ArrayLists.
				Collections.shuffle(names);
				Collections.shuffle(colours);
				// For Loop to then Print the names to a Random colour.
				for(int i = 0; i < names.size() && i < colours.size(); i++) {		    	
					System.out.println(names.get(i) + ": " + colours.get(i));
				}
				break; 
			}
		}
		
	}
}
