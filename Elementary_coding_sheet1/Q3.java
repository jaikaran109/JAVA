package Elementary_Coding1;


//Return last digit of the given number.
//
//Write a function that returns the last digit of the given number. Last digit is being referred to the least significant digit i.e. the digit in the ones (units) place in the given number.
//
//The last digit should be returned as a positive number. for example,
//
//if the given number is 197, the last digit is 7 if the given number is -197, the last digit is 7


import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num < 0) {
			num *= (-1);
		}
		System.out.print(num % 10);

	}

}
