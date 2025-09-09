import java.util.Scanner;
public class Arrays_CW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //INITIALISATTION

        // int[] arr = {213,324,453,657,464};
        // System.out.println(arr[2]);

        // arr[1]=21;  // update 
        // System.out.println(arr[1]);

        // int[] jk = new int[7]; // input of 7 elements

        // int[] arr1 = {213,324,453,657,464};
        // for(int i = 0 ; i < 5; i++){
        //     System.out.println(arr1[i]);
        // }

        System.out.println("Enter size ");
        int size = input.nextInt();
        int[] userInput = new int[size];
        for(int i = 0;i<size;i++){
            userInput[i] = input.nextInt();  //User Input
        }


        //output
        for(int j = 0;j<size;j++){
            System.out.print(userInput[j] + "  "); 
        }
    }
}
