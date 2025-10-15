package Exam_Oriented;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		int n = input.nextInt();
		int res = 1;
		for(int i = 1; i <= n ; i++) {
			res*=i;
		}
		System.out.print(res);

	}

}
