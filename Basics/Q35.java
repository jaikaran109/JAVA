// Write a Java program to print the area and perimeter of a circle. 
// Test Data: Radius = 7.5 
// Area is = 176.71458676442586 
// Expected Output Perimeter is = 47.12388980384689 



import java.util.Scanner;
public class Q35 {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius :");
    double radius = input.nextDouble();
    double circ = 2*3.13*radius;
    double area = 3.14*radius*radius;
    System.out.println("The perimeter is :"+circ);
    System.out.println("The Area is :"+area);
}
}
