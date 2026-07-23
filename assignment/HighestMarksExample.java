import java.util.ArrayList;
import java.util.List;
class Student {
    private String name;
    private int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
}
public class HighestMarksExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rahul", 75));
        students.add(new Student("Anil", 45));
        students.add(new Student("Priya", 90));
        students.add(new Student("Riya", 60));
        Student highest = students.get(0);
        for (Student student : students) {
            if (student.getMarks() > highest.getMarks()) {
                highest = student;
            }
        }
        System.out.println("Student with Highest Marks");
        System.out.println("Name : " + highest.getName());
        System.out.println("Marks : " + highest.getMarks());
    }
}