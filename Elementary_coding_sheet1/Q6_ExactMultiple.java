package Elementary_Coding1;


//Is N an exact multiple of M?
//
//Write a function that accepts two parameters and
//finds whether the first parameter is an exact multiple of the second parameter. If the first parameter is an exact multiple of the second parameter, the function should return 2 else it should return 1.
//
//If either of the parameters are zero, 
//the function should return 3.
//
//Assumption: Within the scope of this question, assume that -
//
//the first parameter can be positive, negative or zero the second parameter will always be >=0



import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		if(n == 0 || m == 0) {
			System.out.print(3);
		}else if( n % m == 0) {
			System.out.print(2);
		}else {
			System.out.print(1);
		}

	}

}
