// Second largest element in a Array


import java.util.Scanner;
public class ArraysQ5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Elements of Array ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        int secondMax = 0;
        for(int i = 0 ; i < size ; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
        }
        System.out.println("Max Element is : "+max);
        System.out.println("Second Max is :"+secondMax);
    }
}


