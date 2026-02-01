package Assisment1;
import java.util.*;
public class CheckSorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        boolean flag = false;
        for(int i = 1 ; i < size ; i++){
            if(arr[i] < arr[i - 1]) {
                flag = true;
                break;
            }
        }
        if(!flag) System.out.println("Sorted");
        else System.out.println("Not Sorted");
    }
}
