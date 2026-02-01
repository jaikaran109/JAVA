package Assisment1;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n  /= 10;
        }
        System.out.println(rev);
    }
}
