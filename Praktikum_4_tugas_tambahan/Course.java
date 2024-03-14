import java.util.ArrayList;
import java.util.List;

public class Course {
    //properties
    private String courseCode;
    private String courseName;
    private Lecture LL;
    private List<Student> studentEnrolled;

    //method
    public Course(String courseCode, String courseName, Lecture LL){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.LL = LL;
        this.studentEnrolled = new ArrayList<>();
    }

    public String getCourseCode(){
        return this.courseCode;
    }
    public String getCourseName(){
        return this.courseName;
    }
    public String getLectureName(){
        return this.LL.getName();
    }

    public void addStudent(Student s){
        studentEnrolled.add(s);
    }
    public void removeStudent(Student s){
        studentEnrolled.remove(s);
    }
    public void viewEnrolledStudents(){
        System.out.print("Enrolled student: ");
        for (int i = 0; i < studentEnrolled.size(); i++) {
            System.out.print(this.studentEnrolled.get(i).getName() + ", ");
        }
    }

}
