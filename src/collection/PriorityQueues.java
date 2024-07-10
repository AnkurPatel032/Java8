package collection;

import java.util.PriorityQueue;

public class PriorityQueues {

    public static void main(String[] args) {
        PriorityQueue<Student> queue=new PriorityQueue<>((o1, o2) -> o1.getGrade()- o2.getGrade());

        queue.offer(new Student("Ankur",'A'));
        queue.offer(new Student("Raj",'B'));
        queue.offer(new Student("Min",'B'));
        queue.offer(new Student("Ankur",'C'));
        System.out.println(queue);

    }
    private static class  Student{
        private final String name;
       private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return "name=" + name + ":"+"grade=" + grade;

        }
    }
}
