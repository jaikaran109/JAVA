// Java Program to Check whether the input number is a Neon Number.



import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = a*a;
    int res = 0;

    while(b!=0){
        res += b%10;
        b /= 10;
    }
    if(res == a){
        System.out.println("Number is Neon Number");
    }else{
        System.out.println("its Not");
    }
}
}
