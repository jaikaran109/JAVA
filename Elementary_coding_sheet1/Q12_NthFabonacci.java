package Elementary_Coding1;


//
//nthFibonacci: Write a function to return the nth number in the fibonacci series.
//
//The value of N will be passed to the function as input parameter.
//
//NOTE: Fibonacci series looks like
//
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, and so on.
//
//i.e. Fibonacci series starts with 0 and 1, and continues generating the next number as the sum of the previous two numbers.
//
//first Fibonacci number is 0.
//
//second Fibonacci number is 1
//
//• third Fibonacci number is 1,
//
//fourth Fibonacci number is 2.
//
//• fifth Fibonacci number is 3.
//
//sixth Fibonacci number is 5.
//
//seventh Fibonacci number is 8, and so on


import java.util.*;
public class Q12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num == 1)
			System.out.print(0);
		if(num == 2)
			System.out.print(1);
		long a = 0 , b = 1 , fib = 0;
		for(int i = 3 ; i <= num ; i++) {
			fib = a + b;
			a = b;
			b = fib;
		}
		System.out.print(fib);
	}

}
