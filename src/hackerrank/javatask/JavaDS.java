package hackerrank.javatask;

import java.util.Hashtable;
import java.util.Map;

public class JavaDS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 20, 30, 40};
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
        Map<Integer, Integer> map = new Hashtable<>();

    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
}
