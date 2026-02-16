package Assessment3;


//Q2.
//
//Take matrix input and print elements in reverse row order.
//
//Example:
//
//        1 2
//        3 4
//
//
//Output:
//
//        3 4
//        1 2


import java.util.*;
public class reverseRowOrder {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();

        int[][] arr = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                arr[i][j] = input.nextInt();
            }
        }

        for(int i = row - 1 ; i >= 0 ; i--){
            for(int j = 0 ; j < col ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
