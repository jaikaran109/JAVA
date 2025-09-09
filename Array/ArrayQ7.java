//Find the doublet in the Array whose sum is equal to the given value x.(Two Sum)
//LEET CODE Q1 TWO SUM

import java.util.Scanner;
public class ArraysQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of Array ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter value of x");
        int x = sc.nextInt();
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                if(arr[i] + arr[j] == x){
                    System.out.println("1st element is "+ i +"value is " +arr[i] + " + " +"2nd element is "+ j +"value is " + arr[j] +" = " +x);
                    break;
                }
            }
        }
    }
}
