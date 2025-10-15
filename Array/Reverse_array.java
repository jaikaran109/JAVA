//Reverse_array

package Exam_Oriented;

import java.util.Scanner;

public class Reverse_array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		for(int i = size-1 ; i >= 0 ; i--) {
			System.out.print(arr[i] + " " );
		}
	}
}
