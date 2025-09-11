//permutation and combination

import java.util.Scanner;
public class MethodsQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();

        int comb = combination(n,r);
        int perm = permutation(n,r);
        System.out.println(comb);
        System.out.println(perm);
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int combination(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nmrFact = factorial(n - r);

        return nFact / (rFact * nmrFact);
    }

    public static int permutation(int n , int r){
        int nFact = factorial(n);
        int nmrFact = factorial(n - r);

        return nFact /  nmrFact ;
    }
}
