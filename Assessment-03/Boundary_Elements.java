package Assessment3;


//Q3. Print Boundary Elements of
//Matrix
//Print only boundary elements in clockwise
//order.
//Input
//3 3
// 1 2 3
// 4 5 6
// 7 8 9

//Output
//1 2 3 6 9 8 7 4

//Constraints:
// • Handle single row & single column
//   edge cases
//• Avoid duplicate printing


import java.util.*;
public class Boundary_Elements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                arr[i][j] = input.nextInt();
            }
        }

        for(int j = 0 ; j < col ; j++){
            System.out.print(arr[0][j] + " ");
        }

        for(int i = 1 ; i < row ; i++){
            System.out.print(arr[i][col-1] + " ");
        }

        if(row > 1){
            for(int j = col-2 ; j >= 0 ; j--){
                System.out.print(arr[row-1][j] + " ");
            }
        }

        if(col > 1){
            for(int i = row-2 ; i >= 1 ; i--){
                System.out.print(arr[i][0] + " ");
            }
        }
    }
}
