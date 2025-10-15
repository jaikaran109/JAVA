//Even_Odd_Array 

package Exam_Oriented;

import java.util.Scanner;

public class Even_Odd_Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		
		int countOdd = 0;
		int countEven = 0;
		
		for(int i = 0 ; i < size ; i++) {
			if(arr[i] % 2 == 0) {
				countEven++;
			}else {
				countOdd++;
			}
		}
		
		System.out.println("Number of odd is "+countOdd +"\nNumber Of Even is "+countEven);
	}

}
