package Assessment2;
import java.util.*;
public class Rotate_Kposition {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        int k = input.nextInt();
        k = k % size;  // for k > size

        int[] res = new int[size];

        int index = 0;
        for(int i = size - k; i < size; i++){
            res[index++] = arr[i]; // last ke terms store ho jayenge
        }

        // baki element jo rah gye the ab add ho jayenge
        for(int i = 0; i < size - k; i++){
            res[index++] = arr[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
