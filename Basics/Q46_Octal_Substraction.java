package Number_System;


//Write a program to subtract any base. like the subtraction of two octal values.


import java.util.*;
public class Octal_Substraction {

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
		
		int diff = 0;
		
		if(decimal1 >= decimal2)
			diff = decimal1 - decimal2;
		else
			diff = decimal2 - decimal1;
		
		int res = 0;
		int z = 1;
		while(diff > 0) {
			res += ((diff % 8) * z);
			diff /= 8;
			z *= 10;
		}
		System.out.print(res);

	}

}
