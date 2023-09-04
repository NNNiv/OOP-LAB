import java.util.Scanner;

public class Employee {
	String eName;
	String eID;
	int basic;
	double da;
	double grossSalary;
	double netSalary;
	
	// Default Constructor
	public Employee() {
		System.out.println("Created new employee record");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name: ");
        eName = sc.next();

        System.out.println("Enter employee ID: ");
        eID = sc.next();

        System.out.println("Enter basic pay: ");
        basic = sc.nextInt();
        
        computeNetSal();
        sc.close();
    }
	
	// Parameterized Constructor
	public Employee(String name, String id, int basicPay) {
		eName  = name;
		eID = id;
		basic = basicPay;
		computeNetSal();
	}
	
	public void display() {
        System.out.println("Employee name: " + eName);
        System.out.println("Employee ID: " + eID);
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
    	System.out.println("Demonstrating default constructors");
    	Employee emp1 = new Employee();
    	emp1.display();
    	System.out.println();
    	System.out.println("Demonstrating parameterized constructors");
    	Employee emp2 = new Employee("Nived", "1221", 5000);
    	emp2.display();
    }
}
