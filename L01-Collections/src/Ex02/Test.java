package Ex02;

import Ex03.College;
import Ex03.Student;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Ex03.College bdu = new College("BDU");
        Ex03.Student s1 = new Ex03.Student(1, "Allan", List.of(4, 4, 7, 10));
        Ex03.Student s2 = new Student(2, "Henrik", List.of(12, 12, 10, 10));

        bdu.addStudent(s1);
        bdu.addStudent(s2);

        System.out.println(bdu.findStudent(2));
        System.out.println(bdu.calcAverage(s2));

    }
}
