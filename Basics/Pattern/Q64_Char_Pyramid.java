// Q:-64 Print the following Pattern.

// E
// E F
// E F E
// E F E D
// E F E D C





//input must be b/w 1 to 15
import java.util.Scanner;

public class Q64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();   // n <= 5 for given pattern

        char[] arr = {'E','F','E','D','C'};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
