// Write a program to print a particular digit in a given position from given integer value. 
// Input:-123456
//             2
// Output-5



import java.util.Scanner;
public class Q34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number :");

        int n = input.nextInt();
        int temp = n;
        int count = 0;

        System.out.println("Enter position ");
        int position = input.nextInt();

        while(temp!=0){
            count++;
            temp = temp / 10;
        }
        if(position <= 0 || position > count){
            System.out.println("Invalid Position / Out Of Range ");
        }
        
        
        for(int i = 1;i < position; i++){
            n /= 10;
        }
        int digit = n % 10;
        System.out.println(digit);
        }
    }

