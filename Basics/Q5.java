// Java Program to Add Two Binary Strings

// Have a look *


import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first binary string: ");
        String bin1 = input.nextLine();

        System.out.print("Enter second binary string: ");
        String bin2 = input.nextLine();


        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);


        int sum = num1 + num2;

        String result = Integer.toBinaryString(sum);

        System.out.println("Sum of binary strings: " + result);
    }
}
