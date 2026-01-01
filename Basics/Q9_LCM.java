// Java Program to Find LCM of 2 numbers




import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int x = a, y = b;
        int LCM = 1;
        int i = 2;
        int least = least(a, b);

        while (i <= least) {
            if (x % i == 0 && y % i == 0) {
                LCM *= i;
                x /= i;
                y /= i;
            } else {
                i++;
            }
        }

        LCM = LCM * x * y;
        System.out.println(LCM);
    }

    public static int least(int a, int b) {
        return (a < b) ? a : b;
    }
}
