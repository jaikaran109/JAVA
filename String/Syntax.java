//Syntax

import java.util.Scanner;
public class String_Syntax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  str1 = "Chai Wallah ";  //
        System.out.println(str1);



        String  s1 = input.next();  //print output till first Space/gap
        System.out.println(s1);  //input jai karan   =   output jai



        String s2 = input.nextLine();
        System.out.println(s2);



        //length() - len of array/str
        //chatAt() - return char/element of that index



        String str2 = "Vashu - Anu ";
        System.out.println("Length func "+str2.length());  // return length of str
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str2.endsWith("Anu"));


        char ch = str2.charAt(6);
        System.out.println("Char At func" + ch);  //return char of that index



        ///indexOf()   - return index of char 
        int idx = str2.indexOf('-');
        System.out.println("Index Of func "+idx);



        // compareTo()  -- compare on the basis of (lexographically arrangment) 
        //  str == gtr(random string); return 0       --  abc == abc return 0
        //  str > gtr; retrurn >0 ;         -- bbc > abc      return +ve
        //  str > gtr;  retrurn <0 ;         -- abc < zbc     return -ve
        String st1 = "Hello";
        String st2 = "Dello";
        System.out.println("Compare To func "+st1.compareTo(st2)); 


        //contains() -- 
        System.out.println("returns it contains or not ----- "+str1.contains("alla"));  //str1 = Chai Wallah 
        
    }
}
