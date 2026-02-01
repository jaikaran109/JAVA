package Assisment1;
import java.util.*;
public class ElementFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        boolean[] visited = new boolean[size];
        for(int i = 0 ; i < size ; i++){
            if(visited[i]) continue;

            int count = 1;

            for(int j = i + 1 ; j < size ; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] +" --> " + count);
        }
    }
}
