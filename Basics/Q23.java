// Java Program to Find Quotient and Remainder:



import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the dividend: ");
        int dividend = input.nextInt();


        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();
        
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        }


        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);

    }
}
