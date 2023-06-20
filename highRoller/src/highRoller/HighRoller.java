// A game between a computer and the user, to see who can win by rolling the highest dice roll (best out of 3).

package highRoller;

// These libraries will aid in choosing the random number for the die and the alert message for the user to roll the die.
import java.util.Random;
import javax.swing.*;

public class HighRoller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("May the Odds be in your Favour!");
		
		// Creating all the variables and assigning them to their necessary int.
		Random random = new Random(); // This will assign random to memory
		int totalNumberOfTurns = 3;
		int systemDie;
		int userDie;
		int systemScore = 0;
		int userScore = 0;
		
		// Creating a for loop will a total of 3 turns.
		for( int turn = 1; turn <= totalNumberOfTurns; turn++) {
			// This will determine the random number from 1-6 for the dice roll.
			systemDie = random.nextInt(6) + 1;
			userDie = random.nextInt(6) + 1;
			// The Option Pane will alert the user to roll the dice to continue with the turns.
			JOptionPane.showMessageDialog(null, "Press Okay to Roll Dice!");
			// This is optional to create spaces between the lining in each turn.
			System.out.println();
			// If and else statements to execute what to output, depending of the winner for each round.
			if( systemDie > userDie ) {
				systemScore = systemScore + 1;
				System.out.println( "Computer has won round " + turn );
				
			} else if( userDie > systemDie ) {
				userScore = userScore + 1;
				System.out.println( "You have won round " + turn );
				
			} else {
				System.out.println( "There seems to be a tie on turn " + turn );
			}
		}
		
		// This is optional to create spaces between the lining in each turn.
		System.out.println();
		
		// If and else statements to execute the global winner of the game.
		if( systemScore > userScore ) {
			System.out.println( "Computer has won the game with a grand score of " + systemScore + " out of " + totalNumberOfTurns + ", While you had " + userScore + " Wins!" );
			
		} else if( userScore > systemScore ) {
			System.out.println( "You have won the game with a grand score of " + userScore + " out of " + totalNumberOfTurns + ", While the computer has " + systemScore + " Wins!" );
			
		} else if( userScore == systemScore ){
			System.out.println( "There seems to be a Tie!" );
			
		}
	}

}
//Done!
