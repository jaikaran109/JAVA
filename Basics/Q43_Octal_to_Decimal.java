package Number_System;


//Write a program to convert any base to decimal, like octal to decimal.


import java.util.*;
public class Octal_to_Decimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int x = 1;
		int ans = 0;
		
		while(n > 0) {
			ans += ((n % 8) * x);
			x *= 8;
			n /= 8;
		}
		System.out.print(ans);

	}

}
