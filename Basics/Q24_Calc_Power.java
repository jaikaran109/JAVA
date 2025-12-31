// Java Program to Calculate the Power of a Number:



import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base = input.nextInt();
        int power = input.nextInt();

        int result = 1;

        for(int i = 1; i <= power; i++){
            result = result * base;
        }

        System.out.println(result);
    }
}
