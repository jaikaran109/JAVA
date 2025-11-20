//Is Palindrome possible?
//
//Write a function to find whether it is possible to get a palindrome number from a given number by re-arranging the positions of its digits. If yes, the function should return 2, else it must return 1. Example1: If the given number is 21251, it is possible to form a palindrome by re-arranging its digits, as 21512 or 12521. So the function must return 2.
//
//Example2: If the given number is 2125, it is not possible to form a palindrome by re-arranging its digi So the function must return 1.
//
//Note: All diits of the given number should be retained while deciding whether they can together form a palindrome.
//
//Assumption: The input number will be a positive integer number >= 1 and <= 25000.



package Elementary_Coding_Sheet2;

import java.util.*;

public class Is_Palindrome_Possible {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int temp = n;
		int[] freq = new int[10];   //store freq 0 - 9 
		while(temp > 0) {
			int rem = temp % 10 ;
			freq[rem]++;
			temp /= 10;
		}
		int oddcount = 0;
		for(int i = 0 ; i < 10 ; i++) {
			if(freq[i] % 2 != 0) {
				oddcount++;
			}
		}
		System.out.print((oddcount <= 1 ) ? 2 : 1); 
	}

}
