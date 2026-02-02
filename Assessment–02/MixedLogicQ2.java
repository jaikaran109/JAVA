package Assessment2;

//Given an array, find:
//
//        Sum of positive even
//
//        Sum of positive odd
//
//        Sum of negative numbers


import java.util.*;
public class MixedLogicQ2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumNeg = 0;
        int sumPosEven = 0;
        int sumPosOdd = 0;

        while (true) {
            int n = input.nextInt();

            if (n == 0) break;

            if (n < 0) {
                sumNeg += n;
            } else if (n % 2 == 0) {
                sumPosEven += n;
            } else {
                sumPosOdd += n;
            }
        }

        System.out.println("Sum of negative numbers = " + sumNeg);
        System.out.println("Sum of positive even numbers = " + sumPosEven);
        System.out.println("Sum of positive odd numbers = " + sumPosOdd);
    }
}
