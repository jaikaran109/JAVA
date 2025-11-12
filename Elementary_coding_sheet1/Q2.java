package Elementary_Coding1;


//IsOdd?
//
//Write a function to find whether the given input number is Odd. If the given number is odd, the function should return 2 else it should return 1.
//
//Note:
//
//The number passed to the function ca can either be negative, positive or zero.
//
//Zero should NOT be treated as odd.


import java.util.*;
public class Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num < 0) {
			num *= (-1);
		}
		if(num > 0 && num % 2 != 0) {
			System.out.print(2);;
		}else {
			System.out.print(1);
		}

	}

}
