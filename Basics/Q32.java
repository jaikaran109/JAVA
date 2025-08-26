// write a program to count number of digits present in a given integer value. 
// Input:-123
// Output-3


import java.util.Scanner;
public class Q32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        while(n!=0){
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
