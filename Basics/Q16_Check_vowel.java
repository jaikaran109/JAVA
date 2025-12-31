import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a single alphabet character: ");
        char ch = input.next().toLowerCase().charAt(0); 
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It's a vowel.");
        } else {
            System.out.println("It's a consonant.");
        }

    }
}
