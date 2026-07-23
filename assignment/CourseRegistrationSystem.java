import java.util.ArrayList;
class Course {
    // Private data members (Encapsulation)
    private String courseName;
    private String courseCode;
    private int credits;
    // Constructor
    public Course(String courseName, String courseCode, int credits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }
    // Getter methods
    public String getCourseName() {
        return courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public int getCredits() {
        return credits;
    }
}
class CourseRegistration {
    ArrayList<Course> courses = new ArrayList<>();
    // Add Course
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println(course.getCourseName() + " added successfully.");
    }
    // Remove Course
    public void removeCourse(String code) {
        boolean found = false;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseCode().equals(code)) {
                System.out.println(courses.get(i).getCourseName() + " removed successfully.");
                courses.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Course not found.");
        }
    }
    // Display All Courses
    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        System.out.println("\nCourse List");
        System.out.println("----------------------------");
        for (Course c : courses) {
            System.out.println("Course Name : " + c.getCourseName());
            System.out.println("Course Code : " + c.getCourseCode());
            System.out.println("Credits     : " + c.getCredits());
            System.out.println();
        }
    }
    // Find Course
    public void findCourse(String code) {
        for (Course c : courses) {
            if (c.getCourseCode().equals(code)) {
                System.out.println("Course Found");
                System.out.println("Name    : " + c.getCourseName());
                System.out.println("Code    : " + c.getCourseCode());
                System.out.println("Credits : " + c.getCredits());
                return;
            }
        }
        System.out.println("Course not found.");
    }
    // Calculate Total Credits
    public void calculateTotalCredits() {
        int total = 0;
        for (Course c : courses) {
            total += c.getCredits();
        }
        System.out.println("Total Credits = " + total);
    }
}
public class CourseRegistrationSystem {
    public static void main(String[] args) {
        CourseRegistration registration = new CourseRegistration();
        // Creating Course Objects
        Course c1 = new Course("Java Programming", "CS101", 4);
        Course c2 = new Course("Database Systems", "CS102", 3);
        Course c3 = new Course("Operating Systems", "CS103", 4);
        // Add Courses
        registration.addCourse(c1);
        registration.addCourse(c2);
        registration.addCourse(c3);
        // Display Courses
        registration.displayCourses();
        // Find Course
        registration.findCourse("CS102");
        // Remove Course
        registration.removeCourse("CS102");
        // Display After Removal
        registration.displayCourses();
        // Calculate Total Credits
        registration.calculateTotalCredits();
    }
}