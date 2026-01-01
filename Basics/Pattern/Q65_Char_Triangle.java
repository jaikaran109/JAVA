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
                System.out.print(" ");
            }
            char ch='A';
            for(int k = 1;k<=i;k++){
                System.out.print(ch);
                ch++;
            }
            ch-=2;
            for(int k = 1;k<i;k++){
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }
}


