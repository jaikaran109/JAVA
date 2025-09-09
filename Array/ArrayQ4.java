//Max element in a Array

import java.util.Scanner;
public class ArraysQ4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = input.nextInt();
        }

        int max = arr[0];
        for(int i = 0 ; i < size ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The max value is :" + max);
    }
}
