import java.util.Scanner;

public class Student {
    String sName;
    int marksArray[];
    int total = 0;
    double avg;

    
    void assign() {
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

        sc.close();
    }

    void display() {
        System.out.println();
        System.out.println("Student name: " + sName);
        System.out.println("The Student's marks are: ");
        for (int i = 0; i < marksArray.length; i++)
            System.out.println(marksArray[i]);
        System.out.println("Marks total: " + total);
        System.out.println("Average marks: " + avg);
    }

    void compute() {
        for (int i = 0; i < marksArray.length; i++)
            total += marksArray[i];
        
        avg = total / marksArray.length;
    }

    public static void main(String args[]) {
        Student obj = new Student();
        obj.assign();
        obj.compute();
        obj.display();
    }
}