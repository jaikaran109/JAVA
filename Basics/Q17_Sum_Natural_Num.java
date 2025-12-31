// Write a program to find the sum of n natural numbers



import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n>0){
            int sum = 0;
            for(int i=1;i<=n;i++){
                sum+=i;
            }
            System.out.println("Sum of All Natural Number b/w 1 to N is :"+sum);
        }else{
            System.out.println("Number is Invalid");
    }
    }
}
