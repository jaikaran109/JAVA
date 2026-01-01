package Number_System;


//Write a program to multiply any base. like the multiplication of two octal values.


import java.util.*;
public class Multiply_Two_Octal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		int decimal1 = 0;
		int x = 1;
		while(a > 0) {
			decimal1 += ((a % 10) * x);
			a /= 10;
			x *= 8;
		}
		
		int decimal2 = 0;
		int y = 1;
		while(b > 0) {
			decimal2 += ((b % 10)*y);
			b /= 10;
			y *= 8;
		}
		
		int mul = decimal1 * decimal2;
		
		int res = 0;
		int z = 1;
		while(mul > 0) {
			res += ((mul % 8) * z);
			mul /= 8;
			z *= 10;
		}
		System.out.print(res);

	}

}
