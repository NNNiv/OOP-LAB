import java.util.Scanner;

public class Employee {
    String eName;
    String eID;
    int basic;
    double da;
    double grossSalary;
    double netSalary;
    String email;

    // Default Constructor
    public Employee() {
        assign();
    }

    void assign() {
        System.out.println("Created new employee record");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name: ");
        eName = sc.nextLine();

        System.out.println("Enter employee ID: ");
        eID = sc.next();

        System.out.println("Enter basic pay: ");
        basic = sc.nextInt();

        computeNetSal();
        formatEmployeeName();
        generateEmail();
        sc.close();
    }

    // Parameterized Constructor
    public Employee(String name, String id, int basicPay) {
        eName = name;
        eID = id;
        basic = basicPay;
        computeNetSal();
    }

    public void formatEmployeeName() {
        String[] names = eName.split(" ");
        eName = "";
        for (String name : names) {
            String firstLetter = name.substring(0, 1).toUpperCase();
            String restOfName = name.substring(1).toLowerCase();
            eName += firstLetter + restOfName + " ";
        }
    }

    public String generateEmail() {
        String[] nameParts = eName.split(" ");
        if (nameParts.length < 2) {
            // If only firstname is entered
            email = nameParts[0].toLowerCase() + "@example.com";
        } else {
            String firstName = nameParts[0].toLowerCase();
            String lastName = nameParts[nameParts.length - 1].toLowerCase();
            email = firstName.charAt(0) + lastName + "@example.com";
        }

        return email;
    }

    public void display() {
        System.out.println("Employee name: " + eName);
        System.out.println("Employee ID: " + eID);
        System.out.println("Employee email ID: " + email);
        System.out.println("Employee basic pay: Rs. " + basic);
        System.out.println("Employee DA: Rs. " + da);
        System.out.println("Employee gross salary: Rs. " + grossSalary);
        System.out.println("Employee net salary: Rs. " + netSalary);
    }

    public void computeNetSal() {
        da = 0.52 * basic;
        grossSalary = basic + da;
        netSalary = 0.7 * grossSalary;
    }

    public static void main(String args[]) {
        Employee emp1 = new Employee();
        System.out.println();
        emp1.display();
    }
}