// Java Program to Find Even Sum of Fibonacci Series Till number N





import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 1 ;i<=n;i++){
            sum+=a;
            int next = a+b;
            a=b;
            b=next;
        }
        System.out.println("Sum till N"+sum);
    }
}
