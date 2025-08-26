// Write a Java program that takes three numbers as input to calculate and print the average of the numbers. 
// Input:-123456
// Output:-3



import java.util.Scanner;
public class Q36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        double avg = (a+b+c)/3;
        System.out.println("The Average of all numbers is :"+avg);
    }
}
