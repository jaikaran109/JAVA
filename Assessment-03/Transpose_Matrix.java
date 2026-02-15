package Assessment3;


//Q2. Transpose of Matrix
//Write a program to find transpose of a
//matrix.
// Input
//2 3
//1 2 3
//4 5 6

//Output
//1 4
//2 5
//3 6

//Constraints:
//• No extra library
//• Use nested loops



import java.util.*;
public class Transpose_Matrix {
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
        for(int i = 0 ; i < col ; i++){
            for(int j = 0 ; j < row ; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
