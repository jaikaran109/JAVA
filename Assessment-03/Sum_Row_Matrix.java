package Assessment3;


//Q1. Sum of Each Row
//Write a program to calculate sum of each
//row in a matrix.
//Input
//2 3
//        1 2 3
//        4 5 6
//Output
//Row1 Sum = 6
//Row2 Sum = 15


import java.util.*;
public class sum_row_Matrix {
    static void sumRow(int[][] nums){
        for(int i = 0 ; i < nums.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < nums[i].length ; j++){
                sum += nums[i][j];
            }
            System.out.println("Row"+(i+1)+" Sum = " + sum);
        }
    }
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
        sumRow(arr);
    }
}
