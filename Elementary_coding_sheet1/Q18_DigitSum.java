package Elementary_Coding1;


//digitSum: The labels on a trader's boxes display a large number (integer). The trader wants to label the boxes with a single digit ranging from 1 to 9. He decides to perform digit sum on this large number, continuously till he gets a single digit number. NOTE: In mathematics, the "digit sum" of a given integer is the sum
//
//of all its digits, (e.g.: the digit sum of 84001 is calculated as 8+4+0+0+1 = 13, the digit sum of 13 is 1+3 = 4).
//
//Write a function (method) that takes as input a large number and returns a single digit by performing continuous digitSum on this number, and on the resulting numbers, till the resulting number is a single digit number in the range 1 to 9.
//Example 1: If the large number whose single-digit digitSum is to be found is 976592, the process is as below -
//
//9+7+6+5+9+2=38
//
//3+8=11
//
//1+1=2
//
//Thus, the single-digit digitSum for the number 976592 is 2.
//
//Example 2: If the large number whose single-digit digitSum is to be found is 123456, the process is as below
//
//1+2+3+4+5+6 =21
//
//2+1=3
//
//Thus, the single-digit digitSum for the number 123456 is 3.
//
//For negative numbers, the result should also be in negative. Example 3: If the large number whose single-digit digitSum is to be found is -123456, the answer would be -3.





import java.util.*;
public class Q18_DigitSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int copy = num;
		if(num < 0)
			num = (-1)*num;
		while(num >= 10) {
			int sum = 0;
			while(num > 0) {
				sum += (num % 10);
				num /= 10;
			}
			if(sum >= 10) {
				num = sum;
			}else {
				num = sum;
			}
		}
		if(copy < 0)
			System.out.print((-1)*num);
		else
			System.out.print(num);
	}

}
