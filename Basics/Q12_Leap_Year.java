// Java Program to Check Leap Year


import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  n = input.nextInt();
        if((n%100!=0 && n%4==0) || n%400==0){
            System.out.println("Year is Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
