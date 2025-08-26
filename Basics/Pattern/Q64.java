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
        int n = input.nextInt();
        for(int i = 1;i<=n;i++){
            char k = 'k';
            System.out.print(k+" ");
            k++;
            for(int j = 1;j<i;j++){
                System.out.print(k+" ");
                k--;
            }
            System.out.println();
        }
    }
}
