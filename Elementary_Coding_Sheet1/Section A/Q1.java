//Question 1
//
//How to Attempt?
//
//IsEven?
//
//Write a function to find whether the given input number is Even. If the given number is even,
//the function should return 2 else it should return 1.

//Note: The number passed to the function can either be negative,
//positive or zero. Zero should be treated as Even.


package Elementary_Coding1;


// is EVEN
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num < 0) {
			num*=(-1);
		}
		if(num % 2 == 0) {
			System.out.print(2);
		}else {
			System.out.print(1);
		}

}
}
