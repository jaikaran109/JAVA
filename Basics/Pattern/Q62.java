// Q:-62 Print the following Pattern.

// A
// B B
// C C C
// D D D D
// E E E E E
// F F F F F F




public class Q62 {
    public static void main(String[] args) {
        char k = 'A';
        for(int i =1;i<=6;i++){
            for(int j =1;j<=i;j++){
                System.out.print(k+" ");
            }
            k++;
            System.out.println();
        }
    }
}
