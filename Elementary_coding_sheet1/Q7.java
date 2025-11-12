package Elementary_Coding1;



//Of the given 5 numbers, How many are even?
//
//Write a function that accepts 5 input parameters and returns the count of how many of those 5 are even.
//
//For example,
//
//If the five input parameters are 12, 17, 19, 14, and 115, there are two even numbers 12 and 14. So, the function must return 2.
//
//Similarly,
//
//If the five input parameters are 15, 0, -12, 19, and 28, there are three even numbers 0, -12 and 28. So, the function must return 3.
//
//Observe that zero is also considered an even number.


import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int num1 = input.nextInt();
		 int num2 = input.nextInt();
		 int num3 = input.nextInt();
		 int num4 = input.nextInt();
		 int num5 = input.nextInt();
		 int count = 0;
		 if(num1 % 2 == 0) {
			 count++;
		 }
		 if(num2 % 2 == 0) {
			 count++;
		 }
		 if(num3 % 2 == 0) {
			 count++;
		 }
		 if(num4 % 2 == 0) {
			 count++;
		 }
		 if(num5 % 2 == 0) {
			 count++;
		 }
		 System.out.print(count);
	}

}
