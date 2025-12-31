//How to Print ASCII Value in Java



import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().charAt(0);
        int ascii = ch;

        System.out.println(ascii);
    }
}
