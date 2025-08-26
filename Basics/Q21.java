// Java Program to Calculate Compound Interest



import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle :");
        double principle = input.nextDouble();
        System.out.println("Number of time interest is compoundeed per year :");
        double n = input.nextDouble();
        System.out.println("Annual Interest Rate :");
        double rate = input.nextDouble();
        System.out.println("Enter Time in Years :");
        double time = input.nextDouble();
        System.out.println("The Amount is :");
        double amount = principle * Math.pow((1+rate/n),n*time);
        double CI = amount-principle;
        System.out.println("Compound Interest is :"+CI);
    }
}
//Formula A = P × (1 + r/n)^(n × t)
//CI = A - P


