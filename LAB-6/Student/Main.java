import java.util.Scanner;

class Student {
	String sName;
	int marksArray[];
	double total = 0;
	double avg;

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
	}

	public void compute() {
		for (int i = 0; i < marksArray.length; i++)
			total += marksArray[i];

		avg = total / marksArray.length;
	}

	public void display() {
		System.out.println("\nStudent name: " + sName);
		System.out.println("The Student's marks are: ");
		for (int i = 0; i < marksArray.length; i++)
			System.out.println(marksArray[i]);
		System.out.println("Marks total: " + total);
		System.out.println("Average marks: " + avg);
	}
}

class ScienceStudent extends Student {
	private int practicalMarks;

	public ScienceStudent() {
		super();
		getPracticalMarks();
		compute();
	}

	Scanner sc = new Scanner(System.in);

	public void getPracticalMarks() {
		System.out.println("Enter practical marks: ");
		practicalMarks = sc.nextInt();
	}

	@Override
	public void compute() {
		for (int i = 0; i < marksArray.length; i++)
			total += marksArray[i];
		total += practicalMarks;
		avg = total / (marksArray.length + 1);
	};

	public void displayPracticalMarks() {
		System.out.println("Practical Marks: " + practicalMarks);
		System.out.println();
	}
}

class ArtsStudent extends Student {
	private String electiveSubject;
	Scanner sc = new Scanner(System.in);

	public ArtsStudent() {
		super();
		getElectiveSubject();
		compute();
	}

	public void getElectiveSubject() {
		System.out.println("Enter elective subject: ");
		electiveSubject = sc.next();
	}

	public void displayElectiveSubject() {
		System.out.println("Elective Subject: " + electiveSubject);
		System.out.println();
	}
}

public class Main {
	public static void main(String[] args) {
    System.out.println("Demonstrating Student class: ")
		Student stud = new Student();
    System.out.println();

    System.out.println("Demonstrating Science Student class: ")
		ScienceStudent sciStud = new ScienceStudent();
    System.out.println();

    System.out.println("Demonstrating Arts Student class: ")
		ArtsStudent artsStud = new ArtsStudent();
    System.out.println();

		stud.compute();
		stud.display();

		sciStud.display();
		sciStud.displayPracticalMarks();

		artsStud.compute();
		artsStud.display();
		artsStud.displayElectiveSubject();
	}
}
