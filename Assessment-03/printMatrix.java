package Assessment3;


//Q1.
//
//        Given a matrix of size r × c, print it:
//
//        Row-wise
//
//        Column-wise


import java.util.*;
public class printMatrix {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Row-wise:");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Column-wise:");
        for(int j = 0 ; j < col ; j++){
            for(int i = 0 ; i < row ; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
