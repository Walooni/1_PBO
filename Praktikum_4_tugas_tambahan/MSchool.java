
public class MSchool {
    public static void main(String[] args) {
        //construct object
        Student s1 = new Student("Budi", 20, "Jalan Dipo 1", "00001");
        Student s2 = new Student("Agus", 18, "Jalan Dipo 2", "00002");
        Lecture l1 = new Lecture("Joko Santoso", 34, "Jalan Dipo 3", "30001");
        Course c1 = new Course("PAIK1", "Alpro", l1);
        Course c2 = new Course("PAIK2", "Daspro", l1);

        // aplication
        System.out.println("=====Student method=====");
        s1.getDetails();
        s1.enrollhCourse(c1);
        s1.enrollhCourse(c2);
        s1.viewEnrolledCourse();

        System.out.println("\n\n=====Lecture Method=====");
        l1.getDetails();
        l1.teachCourse(c1);
        l1.teachCourse(c2);
        l1.viewTaughtCourse();
        
        System.out.println("\n\n=====Course Method======");
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.viewEnrolledStudents();
        System.out.println("\nsetelah remove student:");
        c1.removeStudent(s2);
        c1.viewEnrolledStudents();


    }
}
