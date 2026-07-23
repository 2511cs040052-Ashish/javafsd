import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class StudentFilter {
    public static void main(String[] args) {
        // ----------------- Using Array -----------------
        System.out.println("=== Using Array ===");
        String[] names = {"Rahul", "Anil", "Priya", "Riya"};
        int[] marks = {75, 45, 90, 60};
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 60) {
                System.out.println(names[i] + " : " + marks[i]);
            }
        }
        // ----------------- Using ArrayList -----------------
        System.out.println("\n=== Using ArrayList ===");
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentMarks = new ArrayList<>();
        studentNames.add("Rahul");
        studentMarks.add(75);
        studentNames.add("Anil");
        studentMarks.add(45);
        studentNames.add("Priya");
        studentMarks.add(90);
        studentNames.add("Riya");
        studentMarks.add(60);
        for (int i = 0; i < studentMarks.size(); i++) {
            if (studentMarks.get(i) > 60) {
                System.out.println(studentNames.get(i) + " : " + studentMarks.get(i));
            }
        }
        // ----------------- Using String -----------------
        System.out.println("\n=== Using String ===");
        String data = "Rahul-75,Anil-45,Priya-90,Riya-60";
        String[] students = data.split(",");
        for (String student : students) {
            String[] details = student.split("-");
            String name = details[0];
            int mark = Integer.parseInt(details[1]);
            if (mark > 60) {
                System.out.println(name + " : " + mark);
            }
        }
        // ----------------- Using HashMap -----------------
        System.out.println("\n=== Using HashMap ===");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rahul", 75);
        map.put("Anil", 45);
        map.put("Priya", 90);
        map.put("Riya", 60);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 60) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}