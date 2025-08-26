// Java Program to Check Armstrong Number between Two Integers


//IMPORTANT

import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first limit");
        int limit1 = input.nextInt();

        System.out.println("Enter your Second limit");
        int limit2 = input.nextInt();

        System.out.println("Armstrong number Between "+limit1+" and "+limit2);
        
        for(int num = limit1;num <= limit2;num++){
            int temp = num;
            int countDigit = 0;

            while(temp!=0){
                countDigit++;
                temp/=10;
            }

            temp = num;
            int arm = 0;
            while(temp!=0){
                int rem = temp%10;
                arm+=Math.pow(rem,countDigit);
                temp/=10;
            }


            if(arm == num){
                System.out.println(arm);
            }


        }
    }
}


