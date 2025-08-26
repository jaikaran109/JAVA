// Q:-60 Print the following Pattern.

// A
// A B
// A B C
// A B C D
// A B C D E
// A B C D E F






public class Q60 {
    public static void main(String[] args) {
        for(int i =1;i<=6;i++){
            char k = 'A';
            for(int j = 1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
