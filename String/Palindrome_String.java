//Palindrome_String

package Exam_Oriented;
import java.util.*;
public class Palindrome_String {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		String gtr = "";
		for(int i = str.length() - 1 ; i >= 0 ; i--) {
			gtr+=str.charAt(i);
		}
		if(str.equals(gtr)) {
			System.out.print("String is Palindrome");
		}else {
			System.out.print("String is Not Palindrome");
		}

	}

}
