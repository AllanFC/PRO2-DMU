package Ex02;

import Ex03.Student;

import java.util.LinkedHashMap;
import java.util.Map;

public class College {
    private String name;
    //private List<Student> students = new ArrayList<>();
    //private Set<Student> students = new LinkedHashSet<>();
    private Map<Integer, Student> students = new LinkedHashMap<>();

    public College(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student){
        students.put(student.getStudentNo(), student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public double calcAverage(Student student){
        double sum = 0;
        for(int e : student.getGrades()){
            sum += e;
        }
        return sum/student.getGrades().size();
    }

//    public Student findStudent(int studentNo){
//        Student student = null;
//        for(Student e : students){
//            if(e.getStudentNo() == studentNo){
//                student = e;
//            }
//        }
//        return student;
//    }

    public Student findStudent(int studentNo){
        return students.get(studentNo);
    }

    @Override
    public String toString() {
        return name;
    }
}
