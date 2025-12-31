// How to Reverse a Number in Java




import java.util.Scanner;
public class Q27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int rem=0;
        int rev = 0;
        while(num!=0){
            rem = num % 10;
            rev = rev*10 + rem;
            num /= 10;
        }
        System.out.println(rev);
    }
}
