//Return number of palindromic substrings

import java.util.*;
public class StringQ4 {
    public static boolean ispalindrome(String s) {
        int i = 0 ;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++){
            for(int j = i+1 ; j<=str.length();j++){
                if(ispalindrome(str.substring(i,j))==true){
                    System.out.print(str.substring(i,j)+"  ");
                    count++;
                }
            }
        }
        System.out.println("The number of palindromic substring are :"+count);
    }
}
