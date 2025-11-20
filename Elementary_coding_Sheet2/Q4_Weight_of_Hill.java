//Weight of a hill pattern Given,
//
//the total levels in a hill pattern (input1), the weight of the head level (input2), and the weight increments of each subsequent level (input3), you are expected to find the total weight of the hill pattern.
//
//"Total levels" represents the number of rows in the pattern. "Head level" represents the first row.
//
//Weight of a level represents the value of each star (asterisk) in that row.
//
//The hill patterns will always be of the below format, starting with 1 star at head level and increasing 1 star at each level till level N.
//*
//**
//***
//****
//*****
//
//Land so on till level N
//
//Let us see a couple of examples.

//Example1 -
//
//Given,
//
//the total levels in the hill pattern = 5 (i.e. with 5 rows) the weight of the head level (first row) = 10 the weight increments of each subsequent level = Then, The total weight of the hill pattern will be calculated as = 10 + (12+12) + (14+14+14)+ (16+16+16+16) + (18+18+18+18+18) =
//
//10 + 24 + 42 + 64+ 90 = 230
//
//Example2
//
//Given,
//
//the total levels in the hill pattern = 4 the weight of the head level = 1
//
//the weight increments of each subsequent level = 5 Then, Total weight of the hill pattern will be = 1+ (6+6) +
//
//(11+11+11) + (16+16+16+16) = 1+ 12+ 33+ 64 = 110


package Elementary_Coding_Sheet2;

import java.util.*;

public class Q4_Weight_of_Hill {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int val = input.nextInt();
		int incr = input.nextInt();
		int sum = 0;
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				sum += val;
			}
			val += incr;
		}
		System.out.print(sum);

	}

}
