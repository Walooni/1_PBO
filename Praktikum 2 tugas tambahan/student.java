import java.util.ArrayList;
import java.util.List;

public class student {

    private String name;
    private int age;
    private String address;
    private String studentID;
    private List<course> courseEnrolled;

    public student(String name,int age,String address,String studentID){
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.courseEnrolled = new ArrayList<>();
    }

    public String getStudentName(){
        return this.name;
    }
    public int getStudentAge(){
        return this.age;
    }
    public String getStudentID(){
        return this.studentID;
    }
    public String getStudentAddress(){
        return this.address;
    }
    public void setStudentName(String name){
        this.name = name;
    }
    public void setStudentAge(int age){
        this.age = age;
    }
    public void setStudentAddress(String address){
        this.address = address;
    }
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    public void getDetail(){
        System.out.println("Nama: "+ name);
        System.out.println("Usia: "+ age);
        System.out.println("Alamat: "+ address);
        System.out.println("StudentID: "+ studentID);
    }

    public void enrollCourse(course C){
        courseEnrolled.add(C);
        System.out.println("Course "+ C.getCourseName()+" berhasil ditambahkan.");
    }

    public void viewEnrolledCourse(){
        // System.out.println(this.courseEnrolled);
        System.out.println("Enrolled Course:");
        for (course course : courseEnrolled) {
            System.out.print(course.getCourseName()+" ");
        }


    }


}