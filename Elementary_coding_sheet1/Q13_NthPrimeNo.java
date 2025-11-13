package Elementary_Coding1;


//Nth Prime
//
//Write a function that finds and returns the Nth prime number. N will be passed as input to the function.
//
//Assumption: 1 <= N 1000, where N is the position of the prime number
//
//The first prime number is 2 The second prime number is 3 The third prime number is 5 The fourth prime number is 7 The fifth prime number is 11 and so on.
//
//Example1: If the given number N is 10, the method must return the 10th prime number i.e. 29
//
//Example2: If the given number N is 13, the method must return the 13th prime number i.e. 41


import java.util.*;
class Q13 {

	public static int NthPrime(int input1) {
		int count = 0;
	    int num = 2;

	    while (true) {
	    	if (isPrime(num)) {
	            count++;
	            if (count == input1) {
	                return num;
                  }
	          }
	        num++;
	        }
	    }

	    private static boolean isPrime(int n) {
	        if (n < 2) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	        }


	}


