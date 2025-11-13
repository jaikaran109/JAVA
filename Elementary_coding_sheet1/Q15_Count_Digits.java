package Elementary_Coding1;


//All Digits Count
//
//Write a function to find the count of ALL digits in a given number N. The number will be passed to the function as an input parameter of type int.
//
//Assumption: The input number will be a positive integer number 1 and <= 25000.
//
//
//For e.g.
//
//If the given number is 292, the function should return 3 because there are 3 digits in this number
//
//If the given number is 1015, the function should return 4 because there are 4 digits in this number




import java.util.*;
public class Q15_Count_Digits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count = 0 ;
		while(num > 0) {
			num /= 10;
			count++;
		}
		System.out.print(count);
	}

}
