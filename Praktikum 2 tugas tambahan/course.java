import java.util.ArrayList;
import java.util.List;

public class course {
    private String courseCode;
    private String courseName;
    private lecturer lecture;
    private List<student> studentsEnrolled;

    public course(String courseCode, String courseName, lecturer lecture){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    public String getCourseName(){
        return this.courseName;
    }
    public String getCourseCode(){
        return this.courseCode;
    }
    public lecturer getLecture(){
        return this.lecture;
    }
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setLecture(lecturer lecture){
        this.lecture = lecture;
    }

    public void addStudent(student S){
        studentsEnrolled.add(S);
        System.out.println("Student "+ S.getStudentName()+" berhasil ditambahkan.");
    }
    
    public void removeStudent(student S){
        studentsEnrolled.remove(S);
        System.out.println("Student "+ S.getStudentName()+" berhasil dikeluarkan.");
    }

    public void viewEnrolledStudents(){
        System.out.println("Enrolled Student:");
        for (student student : studentsEnrolled) {
            System.out.print(student.getStudentName()+" ");
        }
        System.out.println("");
    }












}
