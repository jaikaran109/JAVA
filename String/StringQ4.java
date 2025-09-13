//java program to reverse each word in String
//input = let's fun 
//output = s'tel nuf


import java.util.*;
public class StringQ5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){  //mistake -- for last word  there is after that so it'll not reverse
                sb.append(ch);
            }
            else{
                sb.reverse();  //reverse word
                ans += sb;
                ans+=" ";
                sb.delete(0,sb.length());  //to empty sb
            }
        }
        sb.reverse();
        System.out.println(ans+sb);
    }
}
