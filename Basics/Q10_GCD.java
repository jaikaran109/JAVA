// Java Program to Find GCD or HCF of 2 numbers


import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        while(b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }

        System.out.println("GCD = " + a);
    }
}

}
