package palindromeRecursion;

public class palindromeRecursion {

	public static void main(String[] args) {
		
		// Creating Array
		int array[] = {8, 6, 0, 0, 6, 8};
	    int length = array.length;
	 
	    // If statement to determine if array is or is not a palindrome.
	    if(palindrome(array, 0, length - 1) == 1) {
	        System.out.print( "Is a Palindrome!");
	    } else {
	        System.out.println( "Not Palindrome!");
	    }

	}
		
	
	// Method to check if array is the same through out the sequence forward and backward.
	static int palindrome(int arr[], int start, int end) {
		
	    // The Base
	    if (start >= end) {
	        return 1;
	    }
	    // The middle
	    if (arr[start] == arr[end]) {
	        return palindrome(arr, start + 1, end - 1);
	    } else {
	        return 0;
	    }
	    
	}

}


//Resources:
//https://www.youtube.com/watch?v=sE0sH8vSmE4 : video to understand recursion.