package Elementary_Coding1;


//Odd Digits' Sum:
//
//In mathematics, the "digit sum" of a given integer is the sum of all its digits, e.g.
//
//the digit sum of 84001 is calculated as 8+4+0+0+1 = 13, the digit sum of 158 is 1+5+8 = 14.
//
//
//
//Rohan's teacher has asked him to write a function (method) that takes as input a positive number and performs digitSum of only the odd digits in the given number.
//
//Example 1: If the given number is 9625, we must add only the odd digits, i.e. 9+5 = 14 Thus, the OddDigitsSum for the number 9625 is 14.
//
//Example 2: If the given number is 2134, the OddDigitsSum will be 1+3=4
//
//Assumption: The input number will be a positive integer number >= 1 and <= 25000.


import java.util.*;
public class Q20_SumOddDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

			int n = input.nextInt();
			int sum = 0;
			if(n < 0) {
				n*=(-1);
			}
			while(n > 0) {
				int rem = n % 10;
				if(rem % 2 != 0) {
					sum += rem;
				}
				n /= 10;
			}
			System.out.print(sum);
		}
		

	}
