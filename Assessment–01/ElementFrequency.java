package Assisment1;
import java.util.*;
public class Frequency {
    public static void frequency(int[] nums) {
        boolean[] visit = new boolean[nums.length];
        for(int i = 0 ; i < nums.length ; i++) {
            if(visit[i]) continue;   // jo count ho chuka h usko skip kr dega

            int freq = 1;
            for(int j = i + 1 ; j < nums.length ; j++) {
                if(nums[i] == nums[j]) {
                    freq++;
                    visit[j] = true;   // jis position ki value count hogi usko true mark kr dega
                }
            }
            System.out.println(nums[i] + " - > "+ freq);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ;i < size ;i++){
            arr[i] = input.nextInt();
        }
        frequency(arr);
    }
}
