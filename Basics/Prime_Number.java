package Exam_Oriented;

import java.util.*;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		boolean isPrime = true;
		for(int i = 2 ; i < n ; i++) {
			if(n % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.print("Prime Number");
		}else {
			System.out.print("Not Prime Number");
		}
	}

}
