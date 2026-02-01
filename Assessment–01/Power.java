package Assisment1;
import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = 1;
        int pow = input.nextInt();
        for(int i = 1 ; i <= pow ;i++){
            ans *= n;
        }
        System.out.println(ans);
    }
}
