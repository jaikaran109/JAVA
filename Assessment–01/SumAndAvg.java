package Assisment1;
import java.util.*;
public class SumAndAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        for(int i = 0 ; i < size ; i++){
            sum += arr[i];
        }
        System.out.println("Sum is " + sum);
        double avg = (double)sum / size;
        System.out.println("Avg is " + avg);
    }
}
