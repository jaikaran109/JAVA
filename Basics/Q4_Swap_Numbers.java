// Java Program to Swap Two Numbers


import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a;
        a=b;
        b=c;
        System.out.println("Numbers are Swaped :" + a +" and "+ b);
    }
}

