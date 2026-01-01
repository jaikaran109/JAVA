// Write a Java program and compute the sum of an integer's digits. Input Data: Input an integer: 25 Expected Output 
// The sum of the digits is: 7  



import java.util.Scanner;
public class Q37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum =0;
        while(n!=0){
            sum+=(n%10);
            n/=10;
        }
        System.out.println("The Sum of Digits is :"+sum);
    }
}
