package Exam_Oriented;
import java.util.*;
public class Fabonacci_Series {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i = 1 ; i <= n ; i++) {
			System.out.print(a+" ");
			c=a+b;						
			a=b;
			b=c;
		
		}
	}
}



//Sum of even positions 
//
//import java.util.Scanner;
//
//public class Q19 {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		int a = 0 ;
//		int c = 0;
//		int b = 1;
//		int sum = 0;
//		for(int i = 1 ; i <= n ; i++) {
//				System.out.print(a+" ");
//				if(i % 2 == 0) {
//					sum+=a;
//				}
//				c=a+b;
//				a=b;
//				b=c;
//			
//		}
//		System.out.print(" TOTAL SUM IS  "+sum);
//			
//	}
//
//}

