// Q:-58 Print the following Pattern.


// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321



import java.util.Scanner;
public class Q58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k = 1;k <= 2*(n-i);k++){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print(k);
            }
            System.out.println();
        }
        
    }
}
