//substring(i) and substring(i,j)

import java.util.*;
public class String_Substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "abccd";
        System.out.println(str.substring(0,3));
        System.out.println(str.substring(2,5));
        System.out.println(str.substring(0,0));  //empty
        System.out.println(str.substring(3));
        System.out.println(str.substring(0));

System.out.println();

        String s = "Physics";
        for(int j = 2 ; j < 4 ; j++){
            System.out.print(s.substring(j)); //first ysics then sics
        }
    }
}
