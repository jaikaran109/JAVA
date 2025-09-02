// Permutation and Combination Program

import java.util.Scanner;
public class Q25 {

 // Method to calculate factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n ");
        int n = input.nextInt();

        System.out.println("Enter value of r ");
        int r = input.nextInt();

        if(r > n){
            System.out.println("Invalid Input : r not greater than n. ");
        }

        int permutation = factorial(n) / factorial(n - r);

        int combination = factorial(n) / (factorial(r) * factorial(n - r));

        System.out.println("Permutation (nPr): " + permutation);
        System.out.println("Combination (nCr): " + combination);

    }
}


// Permutation: nPr = n! / (n - r)!
// Combination: nCr = n! / [r! * (n - r)!]
