import java.util.ArrayList;
import java.util.List;

public class Lecture extends People{
    // properties
    private List<Course> courseTaught;

    //Method
    public Lecture(String name, int age, String address, String ID){
        this.setName(name);
        this.setAge(age);
        this.setAddress(address);
        this.setID(ID);
        this.courseTaught = new ArrayList<>();
    }


    public void teachCourse(Course c){
        courseTaught.add(c);
    }

    public void viewTaughtCourse(){
        System.out.print("Taught course: ");
        for (int i = 0; i < courseTaught.size(); i++) {
            System.out.print(this.courseTaught.get(i).getCourseName() + ", ");
        }
        
    }

}
