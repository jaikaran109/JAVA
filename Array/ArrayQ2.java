//calc. the sum of all the elements in a given array

import java.util.Scanner;
public class ArraysQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        
        int[] arr = new int[size];
        for(int i = 0; i<size;i++){
            arr[i] = input.nextInt();
        }

        int sum = 0;

        
        for(int i = 0 ; i < arr.length ; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
