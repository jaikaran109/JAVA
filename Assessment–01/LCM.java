package Assisment1;
import java.util.*;
public class LCM {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = (a * b) / gcd(a, b);
        System.out.println("LCM = " + lcm);
    }
}
