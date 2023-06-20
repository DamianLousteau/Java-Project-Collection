// Creating a "TimesTable/Matrix".

package multipleElements;

import java.util.Arrays;
import java.util.Scanner;

public class multipleElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First getting the input from the user (All four inputs).
		System.out.print("Please enter in 4 numbers: \n");
		Scanner sc = new Scanner(System.in);
		int userInput1 = sc.nextInt();
		int userInput2 = sc.nextInt();
		int userInput3 = sc.nextInt();
		int userInput4 = sc.nextInt();
		// Initalizing the 2D array
		int[][] table;
		table = new int[3][4];
		// Creating the array with aid from the user input.
		table[0][0] = userInput1;
		table[0][1] = userInput2;
		table[0][2] = userInput3;
		table[0][3] = userInput4;

		table[1][0] = userInput2;
		table[1][1] = userInput2 * userInput2;
		table[1][2] = userInput2 * userInput3;
		table[1][3] = userInput2 * userInput4;

		table[2][0] = userInput3;
		table[2][1] = userInput3 * userInput2;
		table[2][2] = userInput3 * userInput3;
		table[2][3] = userInput3 * userInput4;

		// A for loop to then run through the 2D array and print it out.
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}


	}


}

// References:
// https://www.youtube.com/watch?v=L3-q2GxAqZA&t=307s : To help understand 2D arrays a little better.