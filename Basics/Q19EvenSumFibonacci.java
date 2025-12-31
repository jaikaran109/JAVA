// Java Program to Find Even Sum of Fibonacci Series Till number N





import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = 0, b = 1;
        int sum = 0;

        for(int i = 1; i <= n; i++){
            if(a % 2 == 0){
                sum += a;
            }
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println(sum);
    }
}
