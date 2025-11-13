package Elementary_Coding1;

//
//Even OR Odd Digits' Sum:
//
//In mathematics, the "digit sum" of a given integer is the sum of all its digits, e.g.
//
//the digit sum of 84001 is calculated as 8+4+0+0+1 = 13,
//the digit sum of 158 is 1+5+8 = 14
//
//Rohan's teacher has asked him to write a function (method) that
//
//takes as input a positive number and performs digitSum of either only the even digits or only the odd digits in the given number, based on the option "even" or "odd".
//
//The function will take two input parameters
//
//- the first parameter will be an integer number representing the number whose digitSum needs to be found
//
//-the second parameter will be a string representing the option,
//which will be either "even" or "odd"
//
//Example 1: If the given number is 9625, and the option is "odd", we must add only the odd digits, i.e. 9+5 = 14 Example 2: If the given number is 2134, and the option is "even", we must add only the even digits, i.e. 2+4 = 6




import java.util.*;
public class Q21_SumOfOddEvenDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

			int n = input.nextInt();
			int sum1 = 0;
			int sum2 = 0;
			if(n < 0) {
				n*=(-1);
			}
			while(n > 0) {
				int rem = n % 10;
				if(rem % 2 != 0) {
					sum2 += rem;
				}else {
					sum1 += rem;
				}
				n /= 10;
			}
			System.out.print("Even Sum"+sum1);
			System.out.print("Odd Sum"+sum2);
		}
		

	}

