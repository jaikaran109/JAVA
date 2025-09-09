//count the number of elements in given array greater tha a given number x


import java.util.Scanner;
public class ArraysQ6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of Array ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Elements of Array ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the number you want to check ");
        int x = input.nextInt();
        
        int count = 0;

        for(int i = 0;i<size;i++){
            if(x == arr[i]){
                count++;
            }
        }
        System.out.println(count);

    }
}
