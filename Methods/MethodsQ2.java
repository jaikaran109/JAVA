//Pascal Triangle

import java.util.Scanner;
public class MethodsQ2 {

    public static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0 ; i <= n ; i++){
            for(int k = n ; k>=i ; k--){
                System.out.print("  ");
            }
            for(int j = 0 ; j <= i ; j++){
                int iCj = fact(i)/(fact(j)*fact(i-j));
                System.out.print(iCj+"   ");
            }
            System.out.println();
        }
    }
}
