package Assessment3;

import java.util.*;
public class Diff2Matrices {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();

        int[][] arr1 = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                arr1[i][j] = input.nextInt();
            }
        }

        int[][] arr2 = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                arr2[i][j] = input.nextInt();
            }
        }

        int[][] ans = new int[row][col];
        for(int i = 0 ; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                ans[i][j] = arr1[i][j] - arr2[i][j];
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
