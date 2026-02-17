package Assessment3;


//Q7. Find Maximum Element

import java.util.*;
public class MaxElement {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int max = Integer.MIN_VALUE;
        int[][] arr = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                arr[i][j] = input.nextInt();
                max = Math.max(max,arr[i][j]);
            }
        }
        System.out.println(max);
    }

}
