// Java Program to Find Largest Among 3 Numbers


import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greater");
        } else if(b>c){
            System.out.println(b+" is greater");
        } else{
            System.out.println(c+" is greater");
        }
    }
}
