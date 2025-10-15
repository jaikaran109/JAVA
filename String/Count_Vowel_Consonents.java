//Count_Vowel_Consonents_String

package Exam_Oriented;

import java.util.Scanner;

public class Count_Vowel_Consonents_String {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		str=str.toLowerCase();
		
		
		
		
		
		int countVowel = 0 , countCons = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'u' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'e') {
				countVowel++;
			}else {
				countCons++;
			}
		}
		System.out.println("Vowels are "+countVowel);
		System.out.print("Consonent are "+countCons);
	}

}




/*
 * 
 * For character
 
char ch = input.next().toLowerCase().charAt(0);
if(!Character.isLetter(ch)) {
	System.out.print(" Invalid Input ");
}else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	System.out.print(" Got it (Vowel) ");
}else {
	System.out.print(" Consonent ");
	}
*/
