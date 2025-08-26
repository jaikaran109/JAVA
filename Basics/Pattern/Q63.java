// Q:-63 Print the following Pattern.

// 5
// 5 4
// 5 4 3
// 5 4 3 2
// 5 4 3 2 1





import java.util.Scanner;
public class Q63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 5;i>=1;i--){
            for(int j = n;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}




