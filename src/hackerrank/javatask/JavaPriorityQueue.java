package hackerrank.javatask;

import java.util.*;

public class JavaPriorityQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Student> students = new PriorityQueue<>();
        int count = scanner.nextInt();
        if (scanner.next().equals("ENTER")) {

            String name = scanner.next();
            double cgpa = scanner.nextDouble();
            int id = scanner.nextInt();
            Student student = new Student(id, name, cgpa);
            students.add(student);

        } else if (scanner.next().equals("SERVED")) {
            students.remove();
        }
        System.out.println(students);
    }
}

class Student implements Comparable<Student>{
    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName(){
        return this.name;
    }
    public int compareTo(Student s)
    {
        if(cgpa == s.cgpa)
        {
            if(name.compareTo(s.name) == 0)
            {
                if(id == s.id)
                    return 0;
                else if (id > s.id)
                    return 1;
                else
                    return -1;
            }
            else
                return name.compareTo(s.name);
        }
        else if(cgpa > s.cgpa)
            return -1;
        else
            return 1;
    }
}

class Priorities{
    public ArrayList<Student> getStudents(List<String> events)
    {
        int n = events.size();
        PriorityQueue<Student> pq = new PriorityQueue<Student>();
        for(String i:events)
        {
            String[] s = new String[4];
            s = i.split("\\s");
            if(s.length>1)
            {
//                pq.add(new Student(s[1],Double.valueOf(s[2]),Integer.parseInt(s[3])));
            }
            else
            {
                pq.poll();
            }
        }
        while(pq.size()>1)
        {
            System.out.println(pq.poll().name);
        }
        return new ArrayList<Student>(pq);
    }
}
