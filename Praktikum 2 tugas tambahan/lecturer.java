import java.util.ArrayList;
import java.util.List;

public class lecturer {
    private String name;
    private int age;
    private String address;
    private String EmployeeID;
    private List<course> courseTaught;

    public lecturer(String name, int age, String address, String employeeID){
        this.name = name;
        this.age = age;
        this.address = address;
        this.EmployeeID = employeeID;
        this.courseTaught = new ArrayList<>();
    }

    public String getLecturerName(){
        return this.name;
    }
    public int getLecturerAge(){
        return this.age;
    }
    public String getEmployeeID(){
        return this.EmployeeID;
    }
    public String getLecturerAddress(){
        return this.address;
    }
    public void setLecturerName(String name){
        this.name = name;
    }
    public void setLecturerAge(int age){
        this.age = age;
    }
    public void setLecturerAddress(String address){
        this.address = address;
    }
    public void setEmployeeID(String employeeID){
        this.EmployeeID = employeeID;
    }

    public void getDetail(){
        System.out.println("Nama: "+ name);
        System.out.println("Usia: "+ age);
        System.out.println("Alamat: "+ address);
        System.out.println("StudentID: "+ EmployeeID);
    }

    public void teachCourse(course C){
        courseTaught.add(C);
        System.out.println("Course "+ C.getCourseName()+" berhasil ditambahkan.");
    }

    public void viewTaughtCourses(){
        System.out.println("Course Taught:");
        for (course course : courseTaught) {
            System.out.print(course.getCourseName()+" ");
        }
    }





}
