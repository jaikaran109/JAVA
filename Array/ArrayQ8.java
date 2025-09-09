//reverse array without using extra array
//Two Pointer Approach

import java.util.Scanner;
public class ArraysQ8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Array ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements of array ");
        for(int k = 0 ; k < size ; k++){
            arr[k] = input.nextInt();
        }

        //initial array
        System.out.println("Initial array");
        for(int k = 0 ; k < size ; k++){
            System.out.print(arr[k]+"  ");
        }

        //reverse
        int i = 0 , j = size-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        //Reversed array
        System.out.println();
        System.out.println("Reversed array");
        for(int k = 0 ; k < size ; k++){
            System.out.print(arr[k]+"  ");
        }
    }
}
