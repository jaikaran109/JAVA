//Check Armstrong

package Exam_Oriented;

import java.util.Scanner;

public class Check_Armstrong {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int temp = n ;
		int rem = 0;
		int res = 0;
		int count = 0;
		while(temp!=0) {
			count++;
			temp/=10;
		}
		temp = n;
		while(temp!=0) {
			rem = temp % 10;
			int res1 = 1;
//			res += Math.pow(rem, count);
			for(int j = 0 ; j < count ; j++) {
				res1*=rem;
			}
			res+=res1;
			temp/=10;
		}
		if(n==res) {
			System.out.print("Armstrong ");
		} else {
			System.out.print("Not Armstrong");
		}

	}

}
