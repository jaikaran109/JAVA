//Second_Largest_Array

package Exam_Oriented;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Largest_Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(arr[size-2]);
		
	}

}
