package Assessment2;
import java.util.*;
public class Longest_incrSubarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ;i++){
            arr[i] = input.nextInt();
        }

        int max = 1;
        int count = 1;
        for(int i = 0 ; i < size - 1 ; i++){
            if(arr[i] < arr[i + 1]) count++;
            else count = 1;
            max = Math.max(max,count);
        }
        System.out.println(max);
    }
}
