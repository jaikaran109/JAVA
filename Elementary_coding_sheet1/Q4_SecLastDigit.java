package Elementary_Coding1;



//Return second last digit of the given number.
//
//Write a function that returns the second last digit of the given number. 
//Second last digit is being referred to the digit in the tens place in the given number.
//
//For example, if the given number is 197, the second last digit is 9
//
//Note1 - The second last digit should be returned as a positive number. 
//i.e. if the given number is -197, the second plast digit is 9
//
//Note2 - If the given number is a single digit number,
//then the second last digit does not exist. In such cases, the function should return -1. 
//i.e. if the given number is 5, the second last digit should be returned as-1


import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num < 0) {
			num *= (-1);
		}
		num /= 10;
		System.out.print(num % 10);

	}

}
