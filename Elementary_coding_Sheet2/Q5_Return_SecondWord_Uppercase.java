package Elementary_Coding_Sheet2;


//Read second word and change to Uppercase: Write a function (method) that takes as input a string (sentence), and returns its second word in uppercase.
//
//For example -
//
//If input1 is "Wipro Technologies Bangalore", the function should return "TECHNOLOGIES"
//
//If input1 is "Hello World", the function should return "WORLD"
//
//If input1 is "Championship 2017 League", the function should return "2017"
//
//If input1 is "Hello" the function should return "LESS"
//
//NOTE 1: If Input1 is a sentence with less than 2 words, the function should return the word "LESS"
//
//NOTE 2: The result should have no leading or trailing spaces.


import java.util.*;
public class Q5_Return_SecondWord_Uppercase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		String[] words = str.trim().split("\\s+");
		if(words.length < 2) System.out.println("LESS");
		else System.out.println(words[1].toUpperCase());
			
		}

	}


