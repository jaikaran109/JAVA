// Java Program to Find the Perimeter of a Rectangle


import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int width = input.nextInt();
        System.out.println("Perimeter of rectangle is :" + 2*(length+width));
    }
}
