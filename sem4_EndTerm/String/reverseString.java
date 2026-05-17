package Sem4EndTerm;
import java.util.*;
public class reverseString {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String gtr = "";
        for(int i = str.length() - 1 ; i >= 0 ; i--){
            gtr += str.charAt(i);
        }
        System.out.println(str);
        System.out.println(gtr);
    }
}



//String str = input.nextLine(); 
//char[] arr = str.toCharArray();
//int l = 0;
//int r = arr.length - 1;
//        while(l < r) {
//char temp = arr[l];
//arr[l] = arr[r];
//arr[r] = temp;
//l++;
//r--;
//        }
//        System.out.println(str);
//        System.out.println(new String(arr));
