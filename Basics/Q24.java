// Java Program to Calculate the Power of a Number:

import java.util.Scanner;
public class Q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Base ");
        int base = input.nextInt();
        System.out.println("Enter Power ");
        int power = input.nextInt();

        System.out.println(Math.pow(base,power));
    }
}
