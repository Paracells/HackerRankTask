package hackerrank.javatask;

import java.util.Scanner;

public class JavaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        while (scanner.hasNext()) {
            String line = scanner.next();
            if (line.isEmpty())
                System.out.println(true);
            else {
                char[] chars = line.toCharArray();
                for (char aChar : chars) {
                    if (aChar == '[')
                        counterA++;
                    if (aChar == '{')
                        counterB++;
                    if (aChar == '(')
                        counterC++;
                    if (aChar == ']')
                        counterA--;
                    if (aChar == '}')
                        counterB--;
                    if (aChar == ')')
                        counterC--;

                }
                System.out.println(counterA == 0 && counterB == 0 && counterC == 0);
                counterA = 0;
                counterB = 0;
                counterC = 0;

            }
        }
    }

}
