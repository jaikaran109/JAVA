package Elementary_Coding1;



//Of the given 5 numbers, How many are even or odd?
//
//Write a function that accepts 6 input parameters.
//
//The first 5 input parameters are of type int.
//
//The sixth input parameter is of type string.
//
//If the sixth parameter contains the value "even", the function is
//
//supposed to return the count of how many of the first five input parameters are even.
//
//If the sixth parameter contains the value "odd", the function is supposed to return the count of how many of the first five input parameters are odd.
//
//for example
//
//If the five input parameters are 12, 17, 19, 14, and 115, and the sixth parameter is "odd", the function must return 3, because there are three odd numbers 17, 19 and 115.
//
//If the five input parameters are 12, 17, 19, 14, and 115, and the sixth parameter is "even", the function must return 2, because there are two even numbers 12 and 14.
//
//Note that zero is considered an even number.




import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int countEvensOdds(int input1, int input2, int input3, int input4, int input5, String input6)
    {
        // Read only region end

        int[] numbers = {input1, input2, input3, input4, input5};
        int count = 0;

        for (int num : numbers) {
            if (input6.equals("even") && num % 2 == 0) {
                count++;
            } else if (input6.equals("odd") && num % 2 != 0) {
                count++;
            }
        }

        return count;
    }
}
