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
public class MapExample {
    public static void main(String[] args) {
        // ==========================
        // Using List and map()
        // ==========================
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Rahul", 75));
        studentList.add(new Student("Anil", 45));
        studentList.add(new Student("Priya", 90));
        studentList.add(new Student("Riya", 60));
        List<String> listNames = studentList.stream()
                                            .map(Student::getName)
                                            .collect(Collectors.toList());
        System.out.println("Names extracted from List:");
        System.out.println(listNames);
        // ==========================
        // Using HashMap and map()
        // ==========================
        HashMap<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Rahul", 75);
        studentMap.put("Anil", 45);
        studentMap.put("Priya", 90);
        studentMap.put("Riya", 60);
        List<String> mapNames = studentMap.entrySet()
                                          .stream()
                                          .map(entry -> entry.getKey())
                                          .collect(Collectors.toList());
        System.out.println("\nNames extracted from HashMap:");
        System.out.println(mapNames);
    }
}