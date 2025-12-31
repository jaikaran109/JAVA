// Java Program to Calculate Compound Interest



import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double principle = input.nextDouble();
        double rate = input.nextDouble();
        double n = input.nextDouble();
        double time = input.nextDouble();

        double amount = principle * Math.pow((1 + (rate / 100) / n), n * time);
        double CI = amount - principle;

        System.out.println(CI);
    }
}
