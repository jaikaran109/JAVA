import java.util.Scanner;
public class Q29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = input.nextInt();

        int sqrt = (int)Math.sqrt(num);

        if(sqrt*sqrt == num){
            System.out.println("perfect Square "+sqrt);
        }else{
            System.out.println("The Number Not have perfect square root");
        }
    }
}
