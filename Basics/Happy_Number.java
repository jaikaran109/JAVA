//Happy Number

package Exam_Oriented;

import java.util.Scanner;

public class Happy_Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int temp = n;
		while(true) {
			int res = 0;
		
			while(temp!=0) {
				int rem = 0 ;
				rem = temp % 10;
				res+=Math.pow(rem, 2);
				temp/=10;
			}
			if(res == 1) {
				System.out.print("Success");
				break;
			}else if (res == 4) {
				System.out.print("Failed");
				break;
			}else {
				temp = res ;
			}

	}
	}
}
