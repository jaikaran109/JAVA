//Sum_of_Elements_Array

package Exam_Oriented;

import java.util.Scanner;

public class Sum_of_Elements_Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int sum = 0;
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		for(int i = 0 ; i < size ; i++) {
			sum+=arr[i];
		}
		System.out.println("The Sum is "+sum);

	}

}
