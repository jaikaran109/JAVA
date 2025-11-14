package Elementary_Coding2;


//Is Palindrome Number? Write a function to find whether the given number N is a palindrome.
//
//A palindrome number is one that reads the same backwards as well as forwards. For e.g. 252, 18981, 5005 are examples of palindrome numbers.
//
//The number will be passed to the function as an input parameter of type int.
//
//If the number is a palindrome, the function should return 2, else it should return 1.
//
//Assumption: The input number will be a positive integer number >= 1 and <= 25000.


import java.util.*;
public class Q1_PalindromeNu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int temp = num ;
		int res = 0;
		while(temp > 0) {
			int rem = temp % 10;
			res = res*10 + rem;
			temp /= 10;
		}
		if(res == num) {
			System.out.print(2);
		}else {
			System.out.print(1);
		}

	}

}
