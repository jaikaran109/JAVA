package Assisment1;

//  --  Even / Odd number

import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
