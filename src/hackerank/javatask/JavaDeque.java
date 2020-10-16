package hackerank.javatask;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class JavaDeque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.push(num);

        }
        long count = deque.stream().filter(x -> x == m).count();
        System.out.println(count);
    }
}
