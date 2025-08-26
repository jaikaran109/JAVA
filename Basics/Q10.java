// Java Program to Find GCD or HCF of 2 numbers


import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int least = least(a,b);
        int i = 2;
        while(i<=least){
            if(a%i==0 && b%i==0){
                System.out.println(i);
            }
            i++;
        }
    }
    public static int least(int a,int b) {
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
}
