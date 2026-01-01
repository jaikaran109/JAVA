// Write a Java program that takes a number as input and prints its multiplication table up to 10. 
// TInput a number: 8 
// Expected Output: 8 x 1 = 8 8 x 2 = 16 8 x 3 = 24 ... 8 x 10 = 80 



import java.util.Scanner;
public class Q31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Table of n is :");
        for(int i = 1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
