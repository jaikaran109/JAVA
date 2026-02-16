package Assessment3;


//Sum of all Elements


import java.util.*;
public class ElementsSum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        int sum = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                arr[i][j] = input.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
