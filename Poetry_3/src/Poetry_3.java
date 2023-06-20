import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.*;

public class Poetry_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// User input 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in the string: ");
		String text = scan.nextLine();
		String cipher = encrypt(text, 13);
		System.out.println();
		System.out.println("Encrypted text: ");

		// Encryption
		System.out.println(cipher);
		System.out.println();

		// Vowel to upperCase from cipher
		System.out.println("Vowels into upperCase letters: ");
		String conVow = conVowUpp(cipher.toCharArray());
		System.out.println(conVow);
		System.out.println();

		// Reverse Vowels of CapVowels.
		System.out.println("This is the string reversed from CapVowels: ");
		String reverse = reverseString(conVow);
		System.out.println(reverse);
		System.out.println();  

		// User input decrypted
		System.out.println("This is the text decrypted: ");
		String decrypted = decrypt(reverse, 13);
		System.out.println(decrypted);
		System.out.println();
		
		// User input Back to Lower Case.
		System.out.println("Vowels into lowerCase letters: ");
		String conVowLower = conVowDown(decrypted.toCharArray());
		System.out.println(conVowLower);
		System.out.println();
		
		
		// Try & catch to encode poem file and encrypt it into a new file.
		// Just make sure you use the correct path to find and create the file as this will differ for every user.
		try {

			File txt = new File("/poem.txt");

			Scanner sc = new Scanner(txt);
			String fileContent = "";

			while(sc.hasNextLine()) {
				fileContent = fileContent.concat(sc.nextLine() + "\n");
			}

			FileWriter writer = new FileWriter("/encodedPoem.txt");

			String encryptFile = encrypt(fileContent, 13);

			writer.write(encryptFile);
			writer.close();

		} catch (Exception e) {
			System.out.println("Error for Encyption");
		}

		// Try & catch encrypted poem to a new file called capitalVowels.txt.
		try {

			File txtEncode = new File("/encodedPoem.txt");

			Scanner sc = new Scanner(txtEncode);
			String upperCase = "";

			while(sc.hasNextLine()) {
				upperCase = upperCase.concat(sc.nextLine() + "\n");
			}

			FileWriter writer_2 = new FileWriter("/capitalVowels.txt");

			String conVowel = conVowUpp(upperCase.toCharArray());

			writer_2.write(conVowel);
			writer_2.close();

		} catch (Exception e) {
			System.out.println("Error CapitalVowels"); 
		}
		
		// Try and Catch for reversing Capital Vowels.
		try {

			File txtCapVow = new File("/capitalVowels.txt");

			Scanner sc = new Scanner(txtCapVow);
			String reverseVowels = "";

			while(sc.hasNextLine()) {
				reverseVowels = reverseVowels.concat(sc.nextLine() + "\n");
			}

			FileWriter writer_3 = new FileWriter("/reversePoem.txt");

			String reverseVow = reverseString(reverseVowels);
			String de_crypt = decrypt(reverseVow, 13);
			String toLower = conVowDown(de_crypt.toCharArray());
			 
			writer_3.write(toLower);
			writer_3.close();

		} catch (Exception e) {
			System.out.println("Error for ReversePoem"); 
		}

	}


	// This method will be used to encrypt data.
	public static String encrypt(String plainText, int shift) {

		// This shift using modulus to 
		if (shift > 26) {
			shift = shift % 26;
		} else if (shift < 0) {
			shift = (shift % 26) + 26;
		}

		// Creating the return.
		String cipherText = "";
		int length = plainText.length();

		// for loop to run through all the charters along with if and else statements for lower and upper case letters.
		for (int i = 0; i < length; i++) {
			char ch = plainText.charAt(i);

			if (Character.isLetter(ch)) {

				if (Character.isLowerCase(ch)) {
					char c = (char) (ch + shift); // Casting 

					if (c > 'z') {
						cipherText += (char) (ch - (26 - shift));

					} else {
						cipherText += c;

					}
				} else if (Character.isUpperCase(ch)) {
					char c = (char) (ch + shift); // Casting

					if (c > 'Z') {
						cipherText += (char) (ch - (26 - shift));
					} else {
						cipherText += c;
					}
				}
			} else {
				cipherText += ch;
			}
		}

		return cipherText;
	}


	// Method that puts vowels into upperCase.
	public static String conVowUpp(char[] str) {

		int length = str.length;
		String upper = "";

		// For loop to then run through the letters and change all the vowels into capital letters using if statement.
		for (int i = 0; i < length; i++) {

			if (str[i] == 'a' || str[i] == 'e' ||
					str[i] == 'i' || str[i] == 'o' ||
					str[i] == 'u') {

				char c = Character.toUpperCase(str[i]);
				str[i] = c;
			}
		}
		// This advanced for loop then joins string to char for return.
		for(char c : str) {
			upper += c;		  
		}
		return upper;
	}
	
	// Method that puts vowels into lowerCase.
	public static String conVowDown(char[] str) {

		int length = str.length;
		String lower = "";

		// For loop to then run through the letters and change all the vowels into lower using if statement.
		// Its important to remember that one the string is de-crypted N R V B H, come from the previous vowels.
		for (int i = 0; i < length; i++) {

			if (str[i] == 'N' || str[i] == 'R' ||
					str[i] == 'V' || str[i] == 'B' ||
					str[i] == 'H') {

				char c = Character.toLowerCase(str[i]);
				str[i] = c;
			}
		}
		// This advanced for loop then joins string to char for return.
		for(char c : str) {
			lower += c;		  
		}
		return lower;
	}


	// This method is for the de-cryption of the encryption.
	public static String decrypt(String plainText, int shift) {

		if (shift > 26) {
			shift = shift % 26;
		} else if (shift < 0) {
			shift = (shift % 26) + 26;
		}

		String cipherText = "";
		int length = plainText.length();

		for (int i = 0; i < length; i++) {
			char ch = plainText.charAt(i);

			if (Character.isLetter(ch)) {

				if (Character.isLowerCase(ch)) {
					char c = (char) (ch - shift);

					if (c < 'a') {
						cipherText += (char) (ch + (26 - shift));

					} else {
						cipherText += c;

					}
				} else if (Character.isUpperCase(ch)) {
					char c = (char) (ch - shift); // Casting

					if (c < 'A') {
						cipherText += (char) (ch + (26 - shift));
					} else {
						cipherText += c;
					}
				}
			} else {
				cipherText += ch;
			}
		}

		return cipherText;
	}


	// Method that reverses said file.
	public static String reverseString(String str){ 

		StringBuilder sb = new StringBuilder(str);  
		sb.reverse();  
		return sb.toString();  

	}  


}	



// References: 
// https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/#:~:text=The%20StringBuilder%20in%20Java%20represents,a%20mutable%20sequence%20of%20characters. understanding string builders
// geeksforgeeks.org/stringbuffer-reverse-method-in-java/#:~:text=reverse()%20is%20an%20inbuilt,the%20reverse%20of%20the%20sequence.&text=Parameters%20%3A%20The%20method%20does%20not,StringBuffer%20after%20reversing%20the%20characters. for understanding reverse() method

// Done!