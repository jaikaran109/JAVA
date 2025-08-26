// Q:-59 Print the following Pattern.

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15






import java.util.Scanner;
public class Q59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
