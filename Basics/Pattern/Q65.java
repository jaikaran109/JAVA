// Q:-65 Print the following Pattern.

//      A
//     ABA
//    ABCBA
//   ABCDCBA
//  ABCDEDCBA






public class Q65 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for(int j = 5;j>i;j--){
                System.out.print("  ");
            }
            char ch='A';
            for(int k = 1;k<=i;k++){
                System.out.print(ch+" ");
                ch++;
            }
            ch-=2;
            for(int k = 1;k<i;k++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}




// VIA COPILOT
/*
public class Q65 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            // Print increasing characters
            char ch = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(ch);
                ch++;
            }

            // Print decreasing characters
            ch -= 2; // Step back to the previous character
            for (int k = 1; k < i; k++) {
                System.out.print(ch);
                ch--;
            }

            System.out.println();
        }
    }
}
*/
