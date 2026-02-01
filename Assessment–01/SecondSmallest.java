package Assisment1;
import java.util.*;
public class SecondSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        int min = Integer.MAX_VALUE ;
        int secMin = Integer.MAX_VALUE;
        for(int i = 0 ; i  < size ; i++){
            if(arr[i] < min){
                secMin = min;
                min = arr[i];
            }else if(arr[i] > min && arr[i] < secMin){
                secMin = arr[i];
            }
        }
        System.out.println(secMin);
    }
}
