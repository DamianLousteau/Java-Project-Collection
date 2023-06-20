
public class LCMRecursion {

	public static void main(String[] args) {
		
		// Creating variables
        int a = 15;
        int b = 20;
        // Print
        System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
 
	}

	
    // Recursive method to return GCD of a and b (Use modulus of b & a)
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
     
    // method to return LCM of two numbers (division of GCD and the multiply by b)
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
	
	
}
