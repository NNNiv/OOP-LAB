import java.util.Scanner;

public class StudentRecord {
    int regNumber;
    String fullName;
    String dateOfJoin;
    short semester;
    float gpa;
    float cgpa;
    int adminNo;
    
    static int n = 0;
    StudentRecord(String fullName, String dateOfJoin, short semester, float gpa, float cgpa, int adminNo) {
        this.fullName = fullName;
        this.dateOfJoin = dateOfJoin;
        this.semester = semester;
        this.gpa = gpa;
        this.cgpa = cgpa;
        regNumber = Integer.parseInt(dateOfJoin.substring(8) + Integer.toString(++adminNo));
        // DD/MM/YYYY
    }

    public void display() {
        System.out.println("Student name: " + fullName);
        System.out.println("Reg Number: " + regNumber);
        System.out.println("Date of joining: " + dateOfJoin);
        System.out.println("Semester: " + semester);
        System.out.println("GPA: " + gpa);
        System.out.println("CGPA: " + cgpa);
    }
    
    public void sortSem(StudentRecord[] record) {
    	for (int i = 0; i < n; i++)
    		for (int j = i + 1; j < n; j++)
    			if (record[i].semester != 0 && record[j].semester != 0)
    				if (record[i].semester> record[j].semester) {
    					StudentRecord temp;
    					temp = record[i];
    					record[i] = record[j];
    					record[j] = temp;
    				}
    }
    
    public void sortCGPA(StudentRecord[] record) {
    	for (int i = 0; i < n; i++)
    		for (int j = i + 1; j < n; j++)
    			if (record[i].cgpa != 0 && record[j].cgpa != 0)
    				if (record[i].cgpa > record[j].cgpa) {
    					StudentRecord temp;
    					temp = record[i];
    					record[i] = record[j];
    					record[j] = temp;
    				}
    	
    }
    
    public void sortNames(StudentRecord[] record) {
    	for (int i = 0; i < n; i++)
    		for (int j = i + 1; j < n; j++)
    			if (record[i].fullName != null && record[j].fullName != null)
    				if (record[i].fullName.compareTo(record[j].fullName) > 0) {
    					StudentRecord temp;
    					temp = record[i];
    					record[i] = record[j];
    					record[j] = temp;
    				}
    }
    
    public void firstLetter(StudentRecord[] record, char letter) {
    	String[] names = new String[n];
    	for (int i = 0; i < n; i++) 
    		if (record[i].fullName.charAt(0) == letter) {
    			names[i] = record[i].fullName;
    		}
    		
		System.out.println("Names that begin with " + letter);

    	for (String name: names)
    		if (name != null)
        		System.out.println(name);
    }
    
    public void subString(StudentRecord[] record, String subStr) {
    	String names[] = new String[n];
    	for (int i = 0; i < n; i++) {
    		if (record[i].fullName.toLowerCase().contains(subStr.toLowerCase())) {
    			names[i] = record[i].fullName;
    			i++;
    		}
    	}
    	System.out.println("Names that contain " + subStr);

    	for (String name: names)
    		if (name != null)
        		System.out.println(name);
    }
    
    public void ChangeName(StudentRecord[] record) {
    	for (int i = 0; i < n; i++) {
    		String[] names = record[i].fullName.split(" ");
    		String finalName = new String();
    		for (int j = 0; j < names.length; j++) {
    			if (j != names.length - 1)
    				finalName += names[j].charAt(0) + ". ";
    			else
    				finalName += names[names.length - 1];
    		}
    		record[i].fullName = finalName;
    	}
    }
    
    public static void main(String args[]) {
 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number of students: ");
    	n = sc.nextInt();
    	if (n < 2)
    		System.out.println("Please enter a minimum of 5 records");
    	else {
    		StudentRecord[] record = new StudentRecord[n];
    		for (int i = 0; i < n; i++) {
    			System.out.println("Enter student admission number: ");
    			int adminNo = sc.nextInt();
				sc.nextLine();
    			System.out.print("Enter Student name: ");
    			String name = sc.nextLine();
    			System.out.println("Enter date of joining (DD/MM/YYYY): ");
    			String dateOfJoin = sc.next();
    			System.out.println("Enter semester: ");
    			short sem = sc.nextShort();
    			System.out.println("Enter GPA: ");
    			float gpa = sc.nextFloat();
    			System.out.println("Enter CGPA: ");
    			float cgpa = sc.nextFloat();
    			record[i] = new StudentRecord(name, dateOfJoin, sem, gpa, cgpa, adminNo);
    		}
    		
    	record[0].ChangeName(record);
    	for (int i = 0; i < n; i++)
    		record[i].display();
    	}	
    }
}