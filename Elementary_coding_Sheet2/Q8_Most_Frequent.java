package Elementary_Coding_Sheet2;


//Most Frequent Digit -You need to find which digit occurs most number of times across the four given input numbers.

//The prototype of the function is:

//int MostFrequentDigit (int input1, int input2, int input3, int input4);

//where,

//input1, input2, input3 and input4 are the four given input numbers.

//The function is expected to find and return the most frequent digit.

//Example1

//If input1=123, input2=234, input3=345, input4=673

//We see that across these four numbers,

//1, 5, 6 and 7 occur once,

//2 and 4 occur twice, and

//3 occurs four times.

//Therefore, 3 is the most frequent digit and so the function must return 3

//NOTE: If more than a digit occurs the same number of most times, then the highest of those digits should be the result. Below example illustrates this.

//Example2

//If input1=123, input2=456, input3=345, input4=5043

//We see that

//0, 1, 2 and 6 occur once, and

//3. 4 and 5 occur thrice.

//As there are three digits (3. 4 and 5) that occur most number of times, the result will be the highest (max) digit out of these three. Hence, the result should be 5

//Let us see couple of more examples

//Example3-

//If input1=1203, input2=7624, input3=2046, and input4=1052 The digit 2 occurs four times.

//Therefore, the most frequent digit = 2

//Example4 -

//If input1=1203, input2=7624, input3=2046, and input4=1002 The digits 0 and 2 occurs four times. 2 is higher than 0. Therefore, the most frequent digit = 2


import java.util.*;

public class Q8_Most_Frequent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		int n4 = input.nextInt();
		
		int[] freq = new int[10];
		
		
		while (n1 > 0) {
	        freq[n1 % 10]++;
	        n1 /= 10;
	    }
	    while (n2 > 0) {
	        freq[n2 % 10]++;
	        n2 /= 10;
	    }
	    while (n3 > 0) {
	        freq[n3 % 10]++;
	        n3 /= 10;
	    }
	    while (n4 > 0) {
	        freq[n4 % 10]++;
	        n4 /= 10;
	    }
	    int max = 0;
	    int result = 0;
	    for(int i = 0 ; i < 10 ; i++) {
	    	if(freq[i] > max || freq[i] == max && i > result) {
	    		max = freq[i];
	    		result = i;
	    	}

	    }
	    System.out.print(result);

}
}
