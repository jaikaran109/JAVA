//Swap two numbers without using a temporary variable.



package Exam_Oriented;

import java.util.Scanner;

public class Swap_number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		a = a + b;
	    b = a - b;
	    a = a - b;
		System.out.print(a+" "+b);
	}

}
