import java.util.Scanner;

public class Employee {
    String eName;
    String eID;
    int basic;
    double da;
    double grossSalary;
    double netSalary;

    void read() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name: ");
        eName = sc.next();

        System.out.println("Enter employee ID: ");
        eID = sc.next();

        System.out.println("Enter basic pay: ");
        basic = sc.nextInt();
        sc.close();
    }

    void display() {
        System.out.println("Employee name: " + eName);
        System.out.println("Employee ID: " + eID);
        System.out.println("Employee basic pay: " + basic);
        System.out.println("Employee DA: " + da);
        System.out.println("Employee gross salary: " + grossSalary);
        System.out.println("Employee net salary: " + netSalary);

    }

    void computeNetSal() {
        da = 0.52 * basic;
        grossSalary = basic + da;
        netSalary = basic + da + grossSalary;
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.read();
        obj.computeNetSal();
        obj.display();
    }
}
