class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", ""); // ye lowercase aur digits ke aalava sb replace kr dega "" se  
        for(int i = 0 ; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i -1)) return false;
        }
        return true;
    }
}


//package Sem4EndTerm;
//import java.util.*;
//public class palindromicString {
//    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String str = input.nextLine();
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
//                System.out.println("Not Palindrome");
//                return;
//            }
//        }
//        System.out.println("Palindrome");
//    }
//}
