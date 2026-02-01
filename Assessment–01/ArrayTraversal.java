package Assisment1;

//Array traversal means accessing each element of the array exactly once.


import java.util.*;
public class ArrayTraversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        for(int x : arr){
            System.out.print(x+" ");
        }

    }
}
