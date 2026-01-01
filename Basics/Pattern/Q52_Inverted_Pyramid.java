// Q:-52 Print the following Pattern.

// ******
// *****
// ****
// ***
// **
// *


public class Q52 {
    public static void main(String[] args) {
        for(int i=6;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
