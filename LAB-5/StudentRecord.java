import java.util.Scanner;

public class StudentRecord {
    int regNumber;
    String fullName;
    String dateOfJoin;
    short semester;
    float gpa;
    float cgpa;

    StudentRecord(String fullName, String dateOfJoin, short semester, float gpa, float cgpa) {
        this.fullName = fullName;
        this.dateOfJoin = dateOfJoin;
        this.semester = semester;
        this.gpa = gpa;
        this.cgpa = cgpa;
        fullName = dateOfJoin.substring(8) + 
        // DD/MM/YYYY
    }

    public void display(Student stud) {
        System.out.println("Student ")
    }
}