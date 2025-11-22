package Elementary_Coding_Sheet_4;


//Find result after alternate add sub on N:
//
//Given a number N (1<=N<=10000), and an option opt=1 or 2, find the result as per below rules, If opt=1,
//
//Result= N- (N-1) + (N-2) - (N-3) + (N-4)
//
//If opt=2,
//
//Result= N+ (N-1) - (N-2) + (N-3) - (N-4)... till 1
//
//Example1: If N = 6, and opt=1 Result = 6-5 +4-3+ 2-1= 3
//
//Example2: If N = 6, and opt=2 Result = 6+ 5-4+ 3-2+ 1=9
//
//The function prototype should be as below int AddSub(int N, int opt);

import java.util.*;
public class Q2_alternate_add_sub_on_N {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int opt = input.nextInt();
		
		int res = n;
		boolean add = (opt == 2);
		for(int i = n - 1 ; i >= 1 ; i--) {
			if(add) {
				res += i;
			}else {
				res -= i;
			}
			add = !add;
		}
		System.out.print(res);

	}

}
