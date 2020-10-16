package hackerank.dailytask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long outputArray[] = new long[n + 2];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            outputArray[a] += k;
            outputArray[b + 1] -= k;
        }
        long max = getMax(outputArray);
        return max;
    }


    private static long getMax(long[] inputArray) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
            max = Math.max(max, sum);
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        System.out.println(String.valueOf(result));
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//        bufferedWriter.close();

        scanner.close();
        callMethod(10);
//        callMethod("test"); ошибка
        List<Integer> integerList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        extendedGenericMethod(integerList);
        extendedGenericMethod(doubleList);
        extendedGenericMethod(numberList);

//        superGenericMethod(integerList); ошибка
//        superGenericMethod(doubleList); ошибка
        superGenericMethod(numberList);

        List<Box<Integer>> integerBox = new ArrayList<>();
//        boxMethod(integerList); ошибка
        List<B> lb = new ArrayList<>();
        List<A> la = new ArrayList<>();
//        lb = la; ошибка
//        callMethod(integerList); ошибка
//        callMethod(doubleList); ошибка
        callMethod(numberList);

        List<EvenNumber> le = new ArrayList<>();
        List<? extends NaturalNumber> ln = le;
//        ln.add(new NaturalNumber()); ошибка
//        ln.add(new EvenNumber()); ошибка

        List<? super NaturalNumber> lee = new ArrayList<>();
        List<NaturalNumber> lnn = new ArrayList<>();

        lee.add(new EvenNumber());
        lee.add(new NaturalNumber());
    }

    public static void callMethod(List<Number> t) {
    }

    public static void extendedGenericMethod(List<? extends Number> t) {
    }

    public static void superGenericMethod(List<? super Number> t) {
    }

    public static void boxMethod(List<? super Box> t) {
    }
}

class Box<T> {

}


class B {
}

class A extends B {
}

class NaturalNumber {
}

class EvenNumber extends NaturalNumber {
}
