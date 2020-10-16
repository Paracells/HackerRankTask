package hackerrank.dailytask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Result {


    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        String t="qw";
        final Integer[] integers = arr.toArray(new Integer[0]);
        for (int i = 0; i < d; i++) {
            int temp = integers[0];
            System.arraycopy(integers, 1, integers, 0, integers.length-1);
            integers[integers.length - 1] = temp;
        }
        return Arrays.stream(integers).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[(i + n - d) % n] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

public class LeftRotation {
    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");*/
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());

        int d = Integer.parseInt(scanner.next());
        scanner.nextLine();
        String[] arrTemp = scanner.nextLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        List<Integer> result = Result.rotateLeft(d, arr);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
      /*  bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
