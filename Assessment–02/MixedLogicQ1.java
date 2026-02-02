package Assessment2;

//Take integers until user enters 0, then:
//
//        Print sum of all numbers
//
//        Print largest number
//
//        Print count of positive & negative numbers


import java.util.*;
public class MixedLogicQ1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int positiveCount = 0;
        int negativeCount = 0;

        while (true) {
            int n = input.nextInt();

            if (n == 0) break;

            sum += n;

            if (n > max) {
                max = n;
            }

            if (n > 0) {
                positiveCount++;
            } else if (n < 0) {
                negativeCount++;
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Largest Number = " + max);
        System.out.println("Positive Count = " + positiveCount);
        System.out.println("Negative Count = " + negativeCount);


    }
}
