// Write a Java program to print the area and perimeter of a circle. 
// Test Data: Radius = 7.5 
// Area is = 176.71458676442586 
// Expected Output Perimeter is = 47.12388980384689 



import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
