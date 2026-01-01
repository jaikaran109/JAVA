package Number_System;


//Write a program to add to any base. like the addition of two octal values.


import java.util.*;
public class Add_Two_Octal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		int decimal1 = 0;
		int x = 1;
		while(a > 0) {
			decimal1 += ((a % 10)*x);
			a /= 10;
			x *= 8;
		}
		
		int decimal2 = 0;
		int y = 1;
		while(b > 0) {
			decimal1 += ((b % 10)*y);
			b /= 10;
			y *= 8;
		}
		
		int ans = decimal1 + decimal2;
		int res = 0;
		int z = 1;
		while(ans > 0) {
			res += ((ans % 10)*z);
			ans /= 10;
			z *= 10;
		}
		System.out.print(res);

	}

}
