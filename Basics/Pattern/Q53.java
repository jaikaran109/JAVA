// Q:-53 Print the following Pattern.

// 123456
// 12345
// 1234
// 123
// 12
// 1

public class Q53 {
    public static void main(String[] args) {
        for(int i=6;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
