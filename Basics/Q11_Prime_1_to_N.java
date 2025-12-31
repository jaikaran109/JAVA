// Java Program to Display All Prime Numbers from 1 to N




import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 2;i<=n;i++){
            int count =0;
            for(int j = 2;j<i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.print(i+"  ");
            }
        }
    }
}
