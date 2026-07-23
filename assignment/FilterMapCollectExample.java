import java.util.*;
import java.util.stream.Collectors;
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
public class FilterMapCollectExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rahul", 75));
        students.add(new Student("Anil", 45));
        students.add(new Student("Priya", 90));
        students.add(new Student("Riya", 60));
        List<String> result = students.stream()
                .filter(student -> student.getMarks() > 60)
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("Students with marks > 60:");
        System.out.println(result);
    }
}