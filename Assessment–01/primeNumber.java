package Assisment1;
import java.sql.SQLOutput;
import java.util.*;
public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

//        1st Method
//        boolean flag = false;
//        for(int i =  2 ; i < n ; i++){
//            if(n % i == 0) {
//                flag = true;
//                break;
//            }
//        }
//        if(!flag) System.out.println("Prime");
//        else System.out.println("Not Prime");



//2nd Approach
        for(int i =  2 ; i < n ; i++){
            if(n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
