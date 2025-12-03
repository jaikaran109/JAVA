package Elementary_Cooding_Sheet3;
//
//Simple Encoded Array 1: Maya has stored few confidential numbers in an array (array of
//
//int). To ensure that others do not find the numbers easily, she has applied a simple encoding. Encoding used: Each array element has been substituted with a value that is the sum of its original value and its succeeding element's value.
//
//i.e. arrţi] = original value of arrţi] + original value of arr[i+1]
//
//e.g. value in arr[0] = original value of arr[0] + original value of arr[1]
//
//Also note that value of last element i.e. arr[last index] remains unchanged.
//
//For example,
//
//If the encoded array is (7,6,8,16,12,3)
//
//The original array should have been (2,5,1,7,9,3)
//
//Provided the encoded array, you are expected to find the
//
//a. First number (value in index 0) in the original array
//
//b. Sum of all numbers in the original array
//
//Write the logic in the function findOriginalFirstAndSum(int[] input1, int input2);
//
//input1 represents the encoded array, and
//
//input2 represents the number of elements in the array input1
//
//The method is expected to-
//
//find the value of the first number of the original array and store it in the member
//
//output1 and
//
//find the sum of all numbers in the original array and store it in the member output2
//
//Note that the output1 and output2 should be returned as
//
//members of a Result object (if the code is being written in Java, C# or C++) -members of a Result struct (if the code is being written in C)
//
//Assumption: The array elements can be positive and/or negative numbers
//
//
//Example 1:
//
//If the encoded array is (7,6,8,16,12,3)
//
//The Original array should have been (2,5,1,7,9,3) So, First number in original array = 2 Sum of all numbers in original array 27
//
//Example 2:
//
//If the encoded array is (-2,-7,-12,-15)
//
//The Original array should have been (8,-10,3,-15) So, First number in original array = 8 Sum of all numbers in original array -14


class Result {
    public int output1;
    public int output2;

    public Result(int out1, int out2) {
        this.output1 = out1;
        this.output2 = out2;
    }
}

public class Q4_SimpleEncoded_Array {

    public static void main(String[] args) {

        int[] input1 = {7, 6, 8, 12, 23}; // Example encoded array
        int input2 = input1.length;

        Result res = findOriginalArrayAndSum(input1, input2);

        System.out.println("First Element of Original Array: " + res.output1);
        System.out.println("Sum of Original Array: " + res.output2);
    }

    public static Result findOriginalArrayAndSum(int[] input1, int input2) {

        int[] original = new int[input2];

        // Last element remains same
        original[input2 - 1] = input1[input2 - 1];

        // Reconstruct original array from back
        for (int i = input2 - 2; i >= 0; i--) {
            original[i] = input1[i] - original[i + 1];
        }

        // Calculate sum of original array
        int sum = 0;
        for (int i = 0; i < input2; i++) {
            sum += original[i];
        }

        return new Result(original[0], sum);
    }
}
