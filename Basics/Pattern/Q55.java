// Q:-55 Print the following Pattern.

// *********
//  *******
//   *****
//    ***
//     *



import java.util.Scanner;
public class Q55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i =1;i<=n;i++){
            for(int  j = 1;j<=i;j++){
                System.out.print("  ");
            }
            for(int k = n;k>=2*i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
