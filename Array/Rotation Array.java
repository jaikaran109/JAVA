//Rotation Array

package Exam_Oriented;

import java.util.Scanner;

public class Rotate_Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		int steps = input.nextInt();
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		for (int i = 0; i < steps; i++) {   //left  -- same for right
            int first = arr[0];             // for right -- last = arr[size - 1]
            for (int j = 0; j < size - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[size - 1] = first;
        }
		for(int i = 0 ; i < size ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
