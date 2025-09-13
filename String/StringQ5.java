//String should be compressed such that consecutive duplicates of character are replaced 
//with the character and followed by the number of consecutive duplicates
//input -- aaabbbccccdde
//output -- a3b3c4d2e

import java.util.*;
public class StringQ6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String ans = ""+str.charAt(0);
        int count = 1 ;
        for(int i = 0 ; i < str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                if(count>1) ans +=count;
                count = 1;
                ans+=curr;
            }
        }
        if(count > 1) ans +=count;
        System.out.println(ans);
    }
}
