package linearProbing;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Queue;

public class LinearProbingVibez {

	public static void main(String[] args) {

		// Creating a scanner object, to take input from user
		Scanner scan = new Scanner(System.in);

		// Display messages
		System.out.println("Linear Probing\n");
		
		//Important to know that the table size can be changes in the constructor!
		LinearProbingTable probingVibez = new LinearProbingTable(5);
		char ch;

		// Do-while loop, do part for performing actions
		do {
			// Menu
			System.out.println("Hash Table Operations\n");
			System.out.println("1. Insert Key & Value ");
			System.out.println("2. Remove Key ");
			System.out.println("3. Size of Table ");
			int choice = scan.nextInt();

			// Switch case
			switch (choice) {

			// Case 1
			case 1:
				// Display message
				System.out.println("Enter key and value");
				probingVibez.insert(scan.next(), scan.next());
				// Break statement to terminate a case
				break;
				// Case 2
			case 2:
				System.out.println("Enter key");
				probingVibez.remove(scan.next());
				break;
				// Case 3
			case 3:
				System.out.println("Size = " + probingVibez.getSize());
				break;

				// Default case
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}

			// Display hash table
			probingVibez.printHashTable();

			// Display message
			System.out.println("Do you want to continue (Type y or n)");

			// Reading character using charAt() method to, fetch
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		probingVibez.printHashTable();
	}


}


// Resourses:
// https://www.youtube.com/watch?v=7eLDTtbzX4M&list=TLPQMTIwNjIwMjF6HVrVZNJw6A&index=11
// https://www.youtube.com/watch?v=B4vqVDeERhI&list=TLPQMTIwNjIwMjF6HVrVZNJw6A&index=10 Probably the most helpful video on how open addressing works.
// https://www.youtube.com/watch?v=7eLDTtbzX4M&list=TLPQMTIwNjIwMjF6HVrVZNJw6A&index=11 Understanding tomb stones
// https://www.youtube.com/watch?v=c3RVW3KGIIE&list=TLPQMTIwNjIwMjF6HVrVZNJw6A&index=13
// https://www.youtube.com/watch?v=PeFyhRr42ac&list=TLPQMTIwNjIwMjF6HVrVZNJw6A&index=14 Just for a understanding in hashsets.
// https://titanwolf.org/Network/Articles/Article?AID=5c357d54-e426-47fd-b284-6ac004e54706#gsc.tab=0 helped mostly as some of this code is the same!
// This seems to be the most common algorithm that has Open Addressing (Linear Probing), no need to fix something that works, However i do understand these concepts presented.