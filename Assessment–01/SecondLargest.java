package Assisment1;
import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++) {
            arr[i] = input.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i = 0 ; i < size ; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }else if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        if (secMax == Integer.MIN_VALUE) {
            System.out.println("Second largest does not exist");
        } else {
            System.out.println(secMax);
        }
    }
}
