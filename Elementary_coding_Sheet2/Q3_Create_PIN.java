//pCreate PIN using three given input numbers
//
//"Secure Assets Private Ltd", a small company that deals with lockers has recently started manufacturing digital locks which can be locked and unlocked using PINs (passwords). You have been asked to work on the module that is expected to generate PINs using three input numbers.
//
//Assumptions: The three given input numbers will always consist of three digits each i.e. each of them will be in the range >=100 and <=999
//
//100 <= input1 <= 999
//
//100 <= input2 <= 999
//
//100 <= input3 <= 999
//
//Below are the rules for generating the PIN -
//
//The PIN should be made up of 4 digits
//
//The unit (ones) position of the PIN should be the least of the units position of the three input numbers
//
//The tens position of the PIN should be the least of the tens position of the three input numbers
//
//- The hundreds position of the PIN should be the least of the hundreds position of the three input numbers
//
//- The thousands position of the PIN should be the maximum of all the input numbers


package Elementary_Coding_Sheet2;

import java.util.*;

public class Q3_Create_PIN {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();   //inputs 100 <= n <= 999 
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		
		int a1 = n1 / 100;
		int a2 = (n1 / 10) % 10;
		int a3 = n1 % 10;
		
		int b1 = n2 / 100;
		int b2 = (n2 / 10) % 10;
		int b3 = n2 % 10;
		
		int c1 = n3 / 100;
		int c2 = (n3 / 10) % 10;
		int c3 = n3 % 10;
		
		int minA = Math.min(a1,Math.min(a2, a3));
		int minB = Math.min(b1,Math.min(b2, b3));
		int minC = Math.min(c1,Math.min(c2, c3));
		
		
		int max = a1;
		max = Math.max(max, a2);
		max = Math.max(max, a3);
		max = Math.max(max, b1);
		max = Math.max(max, b2);
		max = Math.max(max, b3);
		max = Math.max(max, c1);
		max = Math.max(max, c2);
		max = Math.max(max, c3);
		
		
		System.out.print(max*1000 + minA * 100 + minB * 10 + minC);
	}

}
