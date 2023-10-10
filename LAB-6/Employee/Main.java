import java.util.Scanner;

class Employee {
    String eName;
    String eID;
    int basic;
    double da;
    double grossSalary;
    double netSalary;

    public Employee(){
    }
    
    void read() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name: ");
        eName = sc.nextLine();

        System.out.println("Enter employee ID: ");
        eID = sc.next();

        System.out.println("Enter basic pay: ");
        basic = sc.nextInt();
    }

    void displayEmployeeDetails() {
        System.out.println("Employee name: " + eName);
        System.out.println("Employee ID: " + eID);
        System.out.println("Employee basic pay: " + basic);
        System.out.println("Employee DA: " + da);
        System.out.println("Employee gross salary: " + grossSalary);
        System.out.println("Employee net salary: " + netSalary);

    }

    void calculateSalary() {
        da = 0.52 * basic;
        grossSalary = basic + da;
        netSalary = 0.7 * grossSalary;
    }
}

class FullTimeEmp extends Employee {
	
	
	int hoursWorked;
	final static double hourlyRate = 420;
	int bonus;
	int deductions;
	
	public FullTimeEmp() {
		System.out.println("Enter full time employee details: ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name: ");
		eName = sc.nextLine();
		System.out.println("Enter employee ID: ");
		eID = sc.next();
		System.out.println("Enter hours worked: ");
		hoursWorked = sc.nextInt();
		System.out.println("Enter bonus: ");
		bonus = sc.nextInt();
		System.out.println("Enter deductions: ");
		deductions = sc.nextInt();
		
		calculateSalary();
	}
	
	@Override void calculateSalary() {
		netSalary = (hoursWorked * hourlyRate) - bonus + deductions;
	}
	
	@Override void displayEmployeeDetails() {
		System.out.println("Employee name: "+ eName);
		System.out.println("Employee ID: " + eID);
		System.out.println("Employee Salary: " + netSalary);
	}
	
}

class PartTimeEmp extends Employee {
	int hoursWorked;
	final static double hourlyRate = 420;
	
	public PartTimeEmp() {
		System.out.println("Enter part time employee details: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name: ");
		eName = sc.nextLine();
		System.out.println("Enter employee ID: ");
		eID = sc.next();
		System.out.println("Enter hours worked: ");
		hoursWorked = sc.nextInt();
		
		calculateSalary();
	}
	
	@Override void calculateSalary() {
		netSalary = hoursWorked * hourlyRate;
	}
	
	@Override void displayEmployeeDetails() {
		System.out.println("Employee name: "+ eName);
		System.out.println("Employee ID: " + eID);
		System.out.println("Employee Salary: " + netSalary);
	}
}

public class Main {
	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.read();
		emp.calculateSalary();
		FullTimeEmp empFull = new FullTimeEmp();
		PartTimeEmp empPart = new PartTimeEmp();
		
		
		emp.displayEmployeeDetails();
		System.out.println();
		empFull.displayEmployeeDetails();
		System.out.println();
		empPart.displayEmployeeDetails();
	}

}
