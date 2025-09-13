//given String toggle all char of string(eg,to upper and lower)
// input - Physics
// ouptut -pHYSics

import java.util.*;
public class StringQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder str = new StringBuilder(input.next());
        System.out.println(str);

        for(int i = 0 ; i < str.length() ; i++){
            boolean flag = true;
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            int asci = (int)ch;
            if(asci >= 97) flag = false;
            if(flag == true){
                asci+=32;
                char chh = (char)asci;
                str.setCharAt(i,chh);

            }else{
                asci-=32;
                char chh = (char)asci;
                str.setCharAt(i,chh);
            }
        }
        System.out.println("Result"+str);
    }
}
