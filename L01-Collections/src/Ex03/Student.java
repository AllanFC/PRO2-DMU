package Ex03;

import java.util.List;

public class Student implements Comparable<Student>{
    private int studentNo;
    private String name;
    private List<Integer> grades;

    public Student(int studentNo, String name, List<Integer> grades) {
        this.studentNo = studentNo;
        this.name = name;
        this.grades = grades;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + name + " " + grades;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.studentNo, o.studentNo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Student other) {
            return this.studentNo == other.studentNo;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNo;
    }
}
