package Number_System;


//Write a program to convert any base to any base, like binary to octal. 


import java.util.*;

public class Binary_to_Octal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int decimal = 0;
        int base = 1;

        while (n > 0) {
            decimal += (n % 10) * base;
            base *= 2;
            n /= 10;
        }

        int octal = 0;
        base = 1;

        while (decimal > 0) {
            octal += (decimal % 8) * base;
            base *= 10;
            decimal /= 8;
        }

        System.out.println(octal);
    }
}
