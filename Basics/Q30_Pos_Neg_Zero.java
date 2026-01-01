// Java Program to Check if a Number is Positive or Negative.



import java.util.Scanner;
public class Q30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        if(n < 0){
            System.out.println("Input is negative");
        }else if(n == 0){
            System.out.println("Input is zero");
        }else{
            System.out.println("Input is Positive");
        }
        }
    }

