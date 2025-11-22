package Elementary_Coding_Sheet_4;


//Generate series and find Nth element:
//
//Given three numbers, a, b and c, such that
//
//either
//
//a<b<c
//
//or
//
//a>b>c
//
//and
//
//a, b, and c can be positive, negative or zero.
//
//Form the series such that the gap between c and its next element (say d) should be the same as the gap between a and b. Similarly, the gap between c's next element (d) and d's next element (say e) should be the same as the gap between b and c.
//
//Find and return the Nth element.
//
//Example1- If the three numbers are a=1, b=3, c=6 and N=17 The series will be formed as below -
//
//1, 3, 6, 8, 11, 13, 16, 18, 21, 23, 26, 28, 31, 33, 36, 38, 41 17th number in the series is 41
//
//Example2- If the three numbers are a=5, b=-2, c=-4 and N=14 The series will be formed as below
//
//5,-2,-4, -11, -13, -20, -22, -29, -31, -38, 40, -47, -49, -56 14th number in the series is -56

import java.util.*;
public class Q1_NthElement {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		int input1 = input.nextInt();
		int input2 = input.nextInt();
		int input3 = input.nextInt();
		int n = input.nextInt();
		
		if(n == 1) System.out.print(input1);
		if(n == 2) System.out.print(input2);
		if(n == 3) System.out.print(input3);
		
		int diff1 = input2 - input1 ;
		int diff2 = input3 - input2;
		
		int res = input3;
		
		for(int i = 4 ; i <= n ; i++) {
			if(i % 2 == 0) {
				res += diff1;
			}else {
				res += diff2;
			}
		}
		System.out.print(res);
	}

}
