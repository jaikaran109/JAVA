// Q:-66 Print the following Pattern.

// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********





import java.util.Scanner;
public class Q66 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i =1;i<=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print("* ");
            }
            for(int k=2;k<2*i;k++){
                System.out.print("  ");
            }
            for(int m = n;m>=i;m--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=2*n;k>2*i;k--){
                System.out.print("  ");
            }
            for(int m = 1;m<=i;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
