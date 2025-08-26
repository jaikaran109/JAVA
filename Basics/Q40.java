// Write a Java program that takes a number from the user, number should be an integer between 1 and 7. It displays the weekday name. 
// Input:-3 
// Output:- Wednesday 




import java.util.Scanner;
public class Q40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        switch (n) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
            System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
            System.out.println("Thrusday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
            System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Invalid Day");
}
    }
}
