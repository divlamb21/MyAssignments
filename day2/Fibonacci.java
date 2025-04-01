package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 8;  // Number of terms
	        int first = 0, second = 1;  // Starting values of Fibonacci series

	        System.out.println("Fibonacci Series up to  8 terms:");

	        // Print the Fibonacci series
	        for (int i = 1; i <= n; i++) {
	            System.out.print(first + " ");
	            int nextTerm = first + second;  // Calculate the next term
	            first = second;  // Update the first term
 	            second = nextTerm;  // Update the second term
	        }
	    }
	}


