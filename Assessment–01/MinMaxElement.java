package Assisment1;
import java.util.*;
public class MinMaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ;i++){
            arr[i] = input.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for(int i = 1 ; i < size ; i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        System.out.println("Max Element is : " +max);
        System.out.println("Min Element is : " + min);
    }
}
