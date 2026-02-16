package Assessment3;


//Diff2Matrices


import java.util.*;
public class ColumnSum {
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

        int[] colSum = new int[col];
        for(int i = 0 ; i < col ; i++){
            for(int j = 0 ; j < row ; j++){
                colSum[i] += arr[j][i];
            }
        }
        System.out.println(Arrays.toString(colSum));
    }
}
