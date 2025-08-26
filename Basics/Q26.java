// Mirror Inverse Program in Java

public class Q26 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1};
        boolean isMirrorInverse = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[arr[i]] != i) {
                isMirrorInverse = false;
                break;
            }
        }

        if (isMirrorInverse)
            System.out.println("Array is mirror-inverse.");
        else
            System.out.println("Array is NOT mirror-inverse.");
    }
}
