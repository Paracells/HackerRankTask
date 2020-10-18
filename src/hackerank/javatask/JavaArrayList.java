package hackerank.javatask;

import java.util.*;
import java.util.stream.Collectors;

/*
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.
You are given lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in position of line.
 */
public class JavaArrayList {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        List<List<Integer>> listOfArraysLists = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            listOfArraysLists.add(Arrays.stream(scanner.nextLine()
                    .split(" "))
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .collect(Collectors.toList()));
        }
        System.out.println(listOfArraysLists);
        length = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < length; i++) {
            int list = scanner.nextInt();
            int elem = scanner.nextInt();
            try {
                final List<Integer> integerList = listOfArraysLists.get(list-1);
                System.out.println(integerList.get(elem));
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("ERROR!");
            }
        }
    }
}
