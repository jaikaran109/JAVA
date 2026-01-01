// Permutation and Combination Program





import java.util.Scanner;

public class Q25 {

    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int r = input.nextInt();

        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid Input");
            return;
        }

        int permutation = factorial(n) / factorial(n - r);
        int combination = factorial(n) / (factorial(r) * factorial(n - r));

        System.out.println("Permutation (nPr): " + permutation);
        System.out.println("Combination (nCr): " + combination);
    }
}



// Permutation: nPr = n! / (n - r)!
// Combination: nCr = n! / [r! * (n - r)!]
