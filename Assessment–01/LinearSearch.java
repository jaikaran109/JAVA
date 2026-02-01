package Assisment1;
import java.util.*;
public class LinearSearch {

    static String search(int[] nums , int x){
        for(int i = 0 ; i < nums.length ; i++){
            if(x == nums[i]) return "Element Found";
        }
        return "Element Not Found";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();
        String ans = search(arr,target);
        System.out.println(ans);
    }
}
