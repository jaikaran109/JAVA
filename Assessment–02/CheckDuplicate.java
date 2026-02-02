package Assessment2;
import java.util.*;
public class CheckDuplicate {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int[] arr = new int[size];
    for(int i = 0 ; i < size ;i++){
        arr[i] = input.nextInt();
    }
    boolean flag = false;
    Arrays.sort(arr);
    for(int i = 0 ; i < size - 1;i++){
        if(arr[i] == arr[i + 1]){
            flag = true;
            break;
        }
    }
    if(!flag) System.out.println("Not contain Duplicates");
    else System.out.println("Contain Duplicates");
    }
}
