import java.util.Scanner;

class SeatsFilledException extends Exception {
    public SeatsFilledException(String message) {
        super(message);
    }
}

public class Student {
    private static int studentCount = 0;

    private int registrationNumber;
    private String fullName;
    private String dateOfJoining;
    private short semester;
    private float gpa;
    private float cgpa;

    public Student(String fullName, String dateOfJoining, short semester, float gpa, float cgpa)
            throws SeatsFilledException {
        if (studentCount >= 25) {
            throw new SeatsFilledException("Seats are filled. Cannot register more students.");
        }

        this.registrationNumber = generateRegNum(Integer.parseInt(dateOfJoining.substring(0, 4)));
        this.fullName = fullName;
        this.dateOfJoining = dateOfJoining;
        this.semester = semester;
        this.gpa = gpa;
        this.cgpa = cgpa;

        studentCount++;
    }

    private int generateRegNum(int yearOfJoining) {
        return yearOfJoining % 100 * 100 + (++studentCount);
    }

    public void display() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println("Semester: " + semester);
        System.out.println("GPA: " + gpa);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        try {
            Student student1 = new Student("Nived Mohan", "2022-09-12", (short) 1, 3.5f, 3.6f);
            student1.display();

            // Try to create more than 25 students to trigger SeatsFilledException
            for (int i = 0; i < 26; i++) {
                Student student = new Student("Student " + (i + 1),
                        "2022-09-12", (short) 2, 3.2f, 3.4f);
            }
        } catch (SeatsFilledException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
