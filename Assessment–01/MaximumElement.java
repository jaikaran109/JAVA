package Assisment1;
import java.sql.SQLOutput;
import java.util.*;
public class MaximumElement {
    static int maxElement(int[] nums){
        int max = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(max < nums[i]) max = nums[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(maxElement(arr));
    }
}
