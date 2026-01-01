// Q:-61 Print the following Pattern.

// A B C D E F
// A B C D E
// A B C D
// A B C
// A B
// A





public class Q61 {
    public static void main(String[] args) {
        for(int i =6;i>=1;i--){
            char k = 'A';
            for(int j = 1;j <= i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
