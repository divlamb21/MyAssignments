package week1.day2;
import java.util.Scanner;
public class IsPrime {
	

	    public static void main(String[] args) {
	        // Create a Scanner object to take input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt user for a number
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();
	        
	        // Assume the number is prime until proven otherwise
	        boolean isPrime = true;
	        
	        // Loop from 2 to n-1
	        for (int i = 2; i < n; i++) {
	            // If i divides n, it's not a prime number
	            if (n % i == 0) {
	                isPrime = false;
	                break;  // No need to check further if n is already divisible by i
	            }
	        }
	        
	        // Output the result
	        if (isPrime && n > 1) {
	            System.out.println(n + " is a prime number.");
	        } else {
	            System.out.println(n + " is not a prime number.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}
	


