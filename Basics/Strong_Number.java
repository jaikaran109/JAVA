package Exam_Oriented;

import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int temp = n;
		int rem = 0;
		int res = 0;
		while(temp!=0) {
			rem = temp % 10;
			res += fact(rem);
			temp /= 10;
		}
		if(n == res) {
			System.out.print("Yes it's Strong Number ");
		}else {
			System.out.print("No , not strong Number");
		}

	}
	public static int fact(int n) {
		int res = 1;
		for(int i = 1 ; i <= n ; i++) {
			res*=i;
		}
		return res;
	}

}
