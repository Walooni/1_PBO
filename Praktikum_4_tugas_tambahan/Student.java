import java.util.ArrayList;
import java.util.List;

/**
 * Student
 */
public class Student extends People{
    //properties
    private List<Course> coursesEnrolled;
    
    //method
    public Student(String name, int age, String address, String ID){
        this.setName(name);
        this.setAge(age);
        this.setAddress(address);
        this.setID(ID);
        this.coursesEnrolled = new ArrayList<>();
    }

    public void enrollhCourse(Course c){
        this.coursesEnrolled.add(c);
    }

    public void viewEnrolledCourse(){
        System.out.print("Enrolled course: ");
        for (int i = 0; i < coursesEnrolled.size(); i++) {
            System.out.print(coursesEnrolled.get(i).getCourseName()+", ");
        }
        
    }
}