package Ex03;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        College bdu = new College("BDU");
        Student s1 = new Student(1, "Henrik", List.of(4, 4, 7, 10));
        Student s2 = new Student(2, "Allan", List.of(12, 12, 10, 10));

        bdu.addStudent(s1);
        bdu.addStudent(s2);

        System.out.println(bdu.findStudent(2));
        System.out.println(bdu.calcAverage(s2));

        System.out.println(bdu.getStudents());
        System.out.println(bdu.getStudentByName());
    }
}
