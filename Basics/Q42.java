// Write a program to convert decimal to any base, like decimal to octal.

import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        StringBuilder octal = new StringBuilder();

        int original = decimal; // Just for display

        while (decimal > 0) {
            int remainder = decimal % 8;
            octal.append(remainder);
            decimal /= 8;
        }

        System.out.println("Octal : " + octal.reverse());
    }
}
