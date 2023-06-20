package longWords;

import java.util.*;

public class LongWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Creating a user input to enter in the words.
		System.out.println("Enter in the string: ");
		// Scanner for user input.
		Scanner scan = new Scanner(System.in);
		// Input for user.
		String input = scan.nextLine();
		
		// Variables for counting the stings along with variables to help calculate the average.
		int counter1 = 1;
		int counter2 = 1;
		int counter3 = 0;
		int counter4 = 1;
		double sum = 0;
		double average = 0;
		
		// Calculate the average word length.
		// Putting user input into a string.
		String[] words = input.split("\\s+"); // "\\s+" split by whitespace 

		// Iterate over each word and update the string using advanced loop.
		for(String word : words) {
		    double wordLength = word.length();
		    sum += wordLength;
		    counter3++;
		    
		    // If statement to print out the number of words that are over 4 letters.
		    if(wordLength >= 4) {
		    	System.out.println("This will print out words that have over 4 letters: " + word + " " + counter4++);
		    	
		    }
		}
		
		// Calculate the average letters of the words.
		if(counter3 > 0) {
			average = sum / counter3;
			
		} 
		
		// Not necessary, these for loops just display how many words and total letters there are within the string of the users input.
		for(int x = 0; x < input.length() - 1; x++) {
			
			// If and else statements to count and keep track of the amount of letter and numbers.
			if( (input.charAt(x + 1) != ' ') && (input.charAt(x) == ' ') ) {
				counter1 ++;
				
			} 
		}
		
		// Outputting all the information above, including: The output of words over 4 letters,
		// The average of the letters within the words,
		// The number of words,
		System.out.println();
		
		System.out.println("Average word length = " + average);
		
		System.out.println();
		
		System.out.println("Number of words: " + counter1);
		
	}

}

// Resources: 
// https://www.youtube.com/watch?v=O8SLPTrd9yQ : Software Testing and Automation, to find out about how (input.charAt(i + 1) != ' ') && (input.charAt(i) == ' ') work.
// https://www.java67.com/2016/09/3-ways-to-count-words-in-java-string.html : To see how to split array.
// https://www.guru99.com/how-to-split-a-string-in-java.html : To see how to split the array and use it in a loop.
// https://www.tutorialspoint.com/java/java_basic_operators.htm : to understand conditional operators like ? and :.