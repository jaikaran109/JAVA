//Palindrome_Array

package Exam_Oriented;

import java.util.Scanner;

public class Palindrome_Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		boolean isPalindrome = true;
        
        for(int i = 0; i < size / 2; i++) {
            if(arr[i] != arr[size - i - 1]) {
                isPalindrome = false;
                break;
            }
        }
        
        
        if(isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
	}

}
