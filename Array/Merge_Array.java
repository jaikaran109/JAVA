//Merge_Array

package Exam_Oriented;

import java.util.Scanner;

public class Merge_Array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size1 = input.nextInt();
		int[] arr1 = new int[size1];
		for(int i = 0 ; i < size1 ; i++) {
			arr1[i] = input.nextInt();
		}
		
		
		
		int size2 = input.nextInt();
		int[] arr2 = new int[size2];
		for(int i = 0 ; i < size2 ; i++) {
			arr2[i] = input.nextInt();
		}
		int[] arr = new int[size1 + size2];
		for(int i = 0 ; i < size1 ; i++) {
			arr[i] = arr1[i];
		}
		for(int i = 0 ; i < size2 ; i++) {
			arr[i+size1] = arr2[i];
		}
		
		for(int i = 0 ; i < (size1+size2) ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
