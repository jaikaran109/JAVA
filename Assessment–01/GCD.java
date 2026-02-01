package Assisment1;
import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int  y =input.nextInt();
        while(y != 0){
            int r = x % y;
            x = y;
            y = r;
        }
        System.out.println(x);
    }
}
