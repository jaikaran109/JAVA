//Sort_Array 

package Exam_Oriented;

import java.util.Scanner;

public class Sort_Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		
		for(int i = 0 ; i < size - 1 ; i++) {
			for(int j = 0 ; j < size - i - 1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0 ; i < size ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
