// Nama : Yahya Ilham Riyadi
// NIM : 24060122130069

public class Main {
    public static void main(String[] args) {
        course C1,C2;
        student S1,S2;
        lecturer L1,L2;

        L1 = new lecturer("Budi", 27, "Bogor", "12345");
        L2 = new lecturer("Agung", 28, "Cimahi", "12346");

        C1 = new course("A12", "Matematika 1", L1);
        C2 = new course("A13", "Kimia 1", L2);

        S1 = new student("Dudung", 20, "Depok", "abcde");
        S2 = new student("Dadang", 20, "Bogor", "abcdf");

        // student method
        System.out.println("======Student Method======");
        S1.getDetail();
        S1.enrollCourse(C1);
        S1.enrollCourse(C2);
        S2.enrollCourse(C1);
        S2.enrollCourse(C2);
        S1.viewEnrolledCourse();
        
        System.out.println("");
        System.out.println("======Lecturer Method======");
        L1.getDetail();
        L1.teachCourse(C1);
        L1.teachCourse(C2);
        L2.teachCourse(C1);
        L2.teachCourse(C2);
        L1.viewTaughtCourses();

        System.out.println("");
        System.out.println("======Courses Method======");
        C1.addStudent(S1);
        C1.addStudent(S2);
        C1.viewEnrolledStudents();
        C1.removeStudent(S2);
        C1.viewEnrolledStudents();
    }
}
