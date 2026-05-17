package Sem4EndTerm;
import java.util.*;
public class reverseEachWord {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] words = str.split(" ");
        String[] ans = new String[words.length];
        for(int i = 0 ; i < words.length ; i++){
            ans[i] = "";
            for(int j = words[i].length() - 1 ; j >= 0 ; j--) {
                ans[i] += words[i].charAt(j);
            }
        }
        String res = "";
        for(int i = 0 ; i < ans.length ; i++){
            res += ans[i];
            if(i < ans.length) res += " ";
        }
        System.out.println(res);
    }
}
