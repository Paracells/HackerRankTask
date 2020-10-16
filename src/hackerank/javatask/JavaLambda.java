//package hackerrank;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.time.LocalDate;
//import java.util.List;
//import java.util.StringTokenizer;
//import java.util.function.Predicate;
//
//public class JavaLambda {
//    public static void main(String[] args) throws IOException {
//        MyMath ob = new MyMath();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//        PerformOperation op;
//        boolean ret = false;
//        String ans = null;
//        while (T-- > 0) {
//            String s = br.readLine().trim();
//            StringTokenizer st = new StringTokenizer(s);
//            int ch = Integer.parseInt(st.nextToken());
//            int num = Integer.parseInt(st.nextToken());
//            if (ch == 1) {
//                op = ob.isOdd();
//                ret = ob.checker(op, num);
//                ans = (ret) ? "ODD" : "EVEN";
//            } else if (ch == 2) {
//                op = ob.isPrime();
//                ret = ob.checker(op, num);
//                ans = (ret) ? "PRIME" : "COMPOSITE";
//            } else if (ch == 3) {
//                op = ob.isPalindrome();
//                ret = ob.checker(op, num);
//                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
//
//            }
//            System.out.println(ans);
//        }
//    }
//}
//
//interface PerformOperation {
//    boolean isOdd();
//
//
//    boolean isPrime();
//
//    boolean isPalindrome();
//
//    boolean checker(PerformOperation op, int num);
//}
//
//class MyMath {
//
//    public PerformOperation isOdd() {
//        return (int a) -> a % 2 != 0;
//    }
//
//    public PerformOperation isPrime() {
//        return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(1);
//    }
//
//    public PerformOperation isPalindrome() {
//        return (int a) -> Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());
//    }
//}
//}
//
//interface CheckPerson {
//    boolean test(Person p);
//}
//
//class Person {
//
//
//    public enum Sex {
//        MALE, FEMALE
//    }
//
//    String name;
//    LocalDate birthday;
//    Sex gender;
//
//    public String getName() {
//        return name;
//    }
//
//    public LocalDate getBirthday() {
//        return birthday;
//    }
//
//    public Sex getGender() {
//        return gender;
//    }
//
//    public int getAge() {
//        return 0;
//    }
//
//    public void printPerson() {
//        System.out.println("");
//    }
//
//    public static void printPersonOlderThan(List<Person> roster, int age) {
//        for (Person person : roster) {
//            if (person.getAge() >= age) {
//                person.printPerson();
//            }
//
//        }
//    }
//
//    public static void printPersonsWithinAgeRange(
//            List<Person> roster, int low, int high) {
//        for (Person p : roster) {
//            if (low <= p.getAge() && p.getAge() < high) {
//                p.printPerson();
//            }
//        }
//    }
//
//    public static void printPersons(
//            List<Person> roster, CheckPerson tester) {
//        for (Person p : roster) {
//            if (tester.test(p)) {
//                p.printPerson();
//            }
//        }
//    }
//
//    public static void printPersonsWithPredicate(
//            List<Person> roster, Predicate<Person> tester) {
//        for (Person p : roster) {
//            if (tester.test(p)) {
//                p.printPerson();
//            }
//        }
//    }
//}
//
//class CheckPersonEligibleForSelectiveService implements CheckPerson {
//    public boolean test(Person p) {
//        return p.gender == Person.Sex.MALE &&
//                p.getAge() >= 18 &&
//                p.getAge() <= 25;
//    }
//}
