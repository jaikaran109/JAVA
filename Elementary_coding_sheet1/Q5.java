package Elementary_Coding1;


//
//Sum of last digits of two given numbers
//
//Rohit wants to add the last digits of two given numbers. For example,
//
//If the given numbers are 267 and 154, the output should be 11. Below is the explanation
//
//Last digit of the 267 is 7
//
//Last digit of the 154 is 4
//
//Sum of 7 and 4 = 11
//
//Write a program to help Rohit achieve this for any given two numbers.
//
//The prototype of the method should be int addLastDigits(int input1, int input2);
//
//where input1 and input2 denote the two numbers whose last digits are to be added.
//
//Note: The sign of the input numbers should be ignored.
//
//if the input numbers are 267 and 154, the sum of last two digits should be 11
//
//if the input numbers are 267 and -154, the sum of last two digits should be 11
//if the input numbers are -267 and 154, the sum of last two digits should be 11
//
//if the input numbers are -267 and -154, the sum of last two digits should be 11


import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int a = Math.abs(num1);
		int b = Math.abs(num2);
		System.out.print( a % 10 + b % 10);

	}

}
