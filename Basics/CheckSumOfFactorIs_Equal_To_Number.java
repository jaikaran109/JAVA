//Check Sum Of Factor Is Equal To Number



package Exam_Oriented;
import java.util.*;
public class CheckSumOfFactorIs_Equal_To_Number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 1;
		int temp = n ;
		for(int i = 2 ; i < n ; i++) {
			if(temp % i == 0) {
				sum+=i;
			}
		}
		if(sum == n) {
			System.out.print("Perfect Number");
		}else {
			System.out.print("Not Perfect Number");
		}
	}
}
