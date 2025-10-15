package Exam_Oriented;

import java.util.Scanner;

public class GCD_HCF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		while(b!=0){
			int temp = b;
			b=a%b;
			a = temp;
		}
		System.out.print(a);
		
	}
}
