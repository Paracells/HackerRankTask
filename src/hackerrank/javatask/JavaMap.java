package hackerrank.javatask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> personMap = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            personMap.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (!personMap.containsKey(s))
                System.out.println("Not found");
            else
                System.out.println(s + "=" + personMap.get(s));
        }
    }
}
