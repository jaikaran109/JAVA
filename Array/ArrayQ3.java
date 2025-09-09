//Find the element 'x' im the array.Take array and 'x' as input
//Linear search concept


import java.util.Scanner;
public class ArraysQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to find ");
        int x = sc.nextInt();

        //using loop
        // for(int i = 0 ; i < size ; i++){
        //     if(x == arr[i]){
        //         System.out.println("Yes it's :" + x);
        //         break;
        //     }
        // }
        // System.out.println("Absent");

        // via boolean
        boolean flag = false;
        for(int i = 0 ; i < size ; i++){
            if(x == arr[i]){
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Not Found ");
        }else{
            System.out.println("Found ");
        }
    }
}

