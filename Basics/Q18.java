// Java Program to Find Factorial of a number



import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fact = 1;
        if(n<0){
            System.out.println("Number is Invalid");
        } else if(n==0){
            System.out.println("Factorial is :" + 1);
        }else{
            for(int i=n;i>=1;i--){
                fact*=i;
            }
            System.out.println("Factorial is :"+fact);
        }
    }
}
