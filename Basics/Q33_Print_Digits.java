// Write a program to print all digits of a given integer value. 
// Input:-123
// Output-3
//        2
//        1






import java.util.Scanner;
public class Q33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n!=0){
            System.out.println(n%10);
            n/=10;
        }
    }
}
