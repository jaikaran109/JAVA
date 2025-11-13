package Elementary_Coding1;



//Unique Digits Count
//
//Write a function to find the count of unique digits in a given number N. The number will be passed to the function as an input parameter of type int.
//
//Assumption: The input number will be a positive integer number >= 1 and <= 25000.
//
//For e.g.
//
//If the given number is 292, the function should return 2 because there are only 2 unique digits '2 and '9 in this number If the given number is 1015, the function should return 3 because there are 3 unique digits in this number, '1, '0', and '51




import java.util.*;
public class Q16_Unique_Digits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] freq = new int[10];
		int count = 0;
		while(num > 0) {
			int digits = num % 10;
			if(freq[digits] == 0) {
				freq[digits] = 1;
				count++;
			}
			num /= 10;
		}
		System.out.print(count);
	}

}
