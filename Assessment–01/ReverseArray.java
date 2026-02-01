package Assisment1;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }


        int temp = 0;
        for(int i = 0 ; i < size/2 ; i++){
            temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
