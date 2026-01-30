package Elementary_Coding1;


//FACTORIAL of a number
//
//In mathematics, the factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n. For example,
//
//5! = 5 x 4 x 3 x 2 x 1 = 120
//
//
//Write a program to find the factorial of a given number.
//
//
//The given number will be passed to the function as an input parameter of type int.
//
//The function is expected to calculate the factorial of the given number and return it as an int type.
//
//Assumptions for this program:
//
//The given input number will always be greater than or equal to 1. Due to the range supported by int, the input numbers will range from 1 to 12.


import java.util.*;
public class Q11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int result = 1;
		for(int i = 1 ; i <= num ; i++) {
			result *= i;
		}
		System.out.print(result);

	}

}
