// Q:-51 Print the following Pattern.

// 1
// 22
// 333
// 4444
// 55555
// 666666



public class Q51 {
    public static void main(String[] args) {
        for(int i =1 ; i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
