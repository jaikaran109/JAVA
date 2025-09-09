//Rotate the given array by K steps where k is non negative


import java.util.Scanner;
public class ArraysQ9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements of array ");

        //initial Array
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Enter step ");
        int k = input.nextInt();

        
        for(int r = 0;r < k;r++){
            int lastIndexValue = arr[arr.length-1];
            for(int i = arr.length-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=lastIndexValue;
        }

        //final Array
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
