import java.util.Scanner;

public class Student {
    int id;
    String name;

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student record created");
        System.out.print("Enter the student name: ");
        name = sc.nextLine();
        System.out.print("\nEnter student id: ");
        id = sc.nextInt();
        sc.close();
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Student's name: " + name);
        System.out.println("Student's id: " + id);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(1221, "Nived");
        student1.display();
        student2.display();
    }
}