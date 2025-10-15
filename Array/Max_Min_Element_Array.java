//Max_Min_Element_Array

package Exam_Oriented;
import java.util.*;
public class Max_Min_Element_Array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
	
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		int max = arr[0];
		for(int i = 0 ; i < size ; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("Maximum value is "+max);
	
		int min = arr[0];
		for(int i = 0 ; i < size ; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.print("Minimun value is "+min);
	
	}
}
