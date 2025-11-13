package Elementary_Coding1;


//Number of Prime numbers in a specified range.
//
//Write a function to find the count of the number of prime numbers in a specified range. The starting and ending number of the range will be provided as input parameters to the function.
//
//Assumption: 2 <= starting number of the range <= ending number of the range <= 7919
//
//Example1: If the starting and ending number of the range is given as 2 and 20, the method must return 8, because there are 8 prime
//
//numbers in the specified range from 2 to 20, namely (2, 3, 5, 7, 11, 13. 17, 19)
//
//Example2: If the starting and ending number of the range is given as 700 and 725, the method must return 3, because there are 3 prime numbers numbers in the specified range from 700 to 725, namely (701, 709, 719)
//



import java.util.*;
public class Q14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int input1 = input.nextInt();
		int input2 = input.nextInt();
	        int count = 0;
	        for (int i = input1; i <= input2; i++) {
		        boolean isPrime = true;

		        if (i < 2) {
		            isPrime = false;
		        } else {
		            for (int j = 2; j <= Math.sqrt(i); j++) {
		                if (i % j == 0) {
		                	isPrime = false;
		                    break;
		                }
		            }
		        }

		        if (isPrime) {
	                count++;
	            }
	        }

		    System.out.print(count);
		    
	}

}
