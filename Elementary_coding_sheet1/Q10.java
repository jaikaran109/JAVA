package Elementary_Coding1;



//isPrime?
//
//Write a function that finds whether the given number N is Prime or
//
//not
//
//If the number is prime, the function should return 2 else it must return 1.
//
//Assumption: 2 <= N <=5000, where N is the given number.
//
//Example1: if the given number N is 7, the method must return 2 Example2: if the given number N is 10, the method must return 1


import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();

        if (input1 <= 1) {
            System.out.print(1); // Not prime
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(input1); i++) {
                if (input1 % i == 0) {
                    System.out.print(1); // Not prime
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(2); // Prime
            }
        }
    }
}
