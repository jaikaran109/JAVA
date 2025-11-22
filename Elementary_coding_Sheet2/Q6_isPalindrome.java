package Elementary_Coding_Sheet2;

//Write a function (method) to determine whether the input string is a Palindrome or not.
//
//What is a Palindrome?
//
//A palindrome is a string that spells the same from either directions, for example - abba, appa, amma, malayalam, nayan, deed, level, madam, rotator, reviver, stats, tenet, ..
//
//If the input string is a palindrome, the function should return 2 If the input string is NOT a palindrome, the method should return 1
//
//NOTE: The case of the letters in the string should not matter, i.e. Madam, MAdam, madAM, madam, MADAM, should all be considered a palindrome.
//
//ASSUMPTIONS: Within the scope of this assessment, you can assume the following, and so you do not have to write code to handle the below conditions
//
//1. The passed input string will always be a single word and not a sentence
//
//2. The passed input string will only contain alphabets

import java.util.*;
public class Q6_IsPalindrome_String {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String gtr = "";
		for(int i = str.length() - 1 ; i >= 0 ; i--) {
			gtr += str.charAt(i);
		}
		if(str.equals(gtr)) System.out.print(2);
		else System.out.print(1);

	}

}
