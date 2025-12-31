// Java Program to Check Palindrome given number.


import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int b =n;
        int rev =0;
        int a=0;
        while(n!=0){
            a=n%10;
            rev=rev*10+a;
            n=n/10;
        }
        if(b == rev){
            System.out.println("it's palindrome");
        }else{
            System.out.println("it's Not");
        }
    }
}
