import java.util.Scanner;

public class Student {
    String sName;
    int marksArray[];
    double total = 0;
    double avg;

    // Default Constructor
    public Student() {
        System.out.println("Created new student record");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        sName = sc.next();

        int n;
        System.out.print("Enter the number of subjects: ");
        n = sc.nextInt();
        marksArray = new int[n];
        System.out.print("Enter the marks of " + n + " subjects: ");

        for (int i = 0; i < n; i++)
            marksArray[i] = sc.nextInt();

        compute();
        sc.close();
    }

    // Parameterized Constructor
    public Student(String name, int marks[]) {
        sName = name;
        marksArray = marks;
        compute();
    }

    public void compute() {
        for (int i = 0; i < marksArray.length; i++)
            total += marksArray[i];

        avg = total / marksArray.length;
    }

    public void display() {
        System.out.println();
        System.out.println("Student name: " + sName);
        System.out.println("The Student's marks are: ");
        for (int i = 0; i < marksArray.length; i++)
            System.out.println(marksArray[i]);
        System.out.println("Marks total: " + total);
        System.out.println("Average marks: " + avg);
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating default constructor");
        Student stu1 = new Student();
        stu1.display();

        System.out.println();

        System.out.println("Demonstarting parameterized constructor");
        int[] marks = { 10, 11, 12, 12, 14 };
        Student stu2 = new Student("Nived", marks);
        stu2.display();
    }
}
