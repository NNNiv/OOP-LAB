package lab_5;

import java.util.Scanner;

public class Student {
    String sName;
    int marksArray[];
    double total = 0;
    double avg;

    // Default Constructor
    public Student() {
        System.out.println("Created new student record");
        assign();
        compute();
        
    }
    void assign() {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        sName = sc.nextLine();

        int n;
        System.out.print("Enter the number of subjects: ");
        n = sc.nextInt();
        marksArray = new int[n];
        System.out.print("Enter the marks of " + n + " subjects: ");

        for (int i = 0; i < n; i++)
            marksArray[i] = sc.nextInt();
    }
    // Parameterized Constructor
    public Student(String name, int marks[]) {
        sName = name;
        marksArray = marks;
        compute();
    }
    
    public String extractInitials() {
    	String initial = new String();
    	String[] names = sName.split(" ");
    	for (String name: names) {
    		initial += name.substring(0, 1).toUpperCase();
    	}
    	
    	return initial;
    	
    }
 
    public String removeWhitespace() {
    	String noSpace = new String();
    	String[] names = sName.split(" ");
    	for (String name: names) {
    		noSpace += name;
    	}
    	return noSpace;
    	
    }
    public static String[] substring(Student[] students, String subStr) {
    	String names[] = new String[30];
    	int i = 0;
    	for (Student student: students) {
    		if (student.sName.toLowerCase().contains(subStr.toLowerCase())) {
    			names[i] = student.sName;
    			i++;
    		}
    	}
    			
    	return names;
    	
    }
    public static String[] sort(Student[] students) {
    	String names[] = new String[30];
    	int i = 0;
    	for (Student student: students) {
    		names[i] = student.sName;
    		i++;
    	}
    	
    	for (i = 0; i < names.length; i++)
    		for (int j = i + 1; j < names.length; j++)
    			if (names[i] == null && names[j] != null)
    				if (names[i].compareTo(names[j]) > 0) {
    					String temp = names[i];
    					names[i] = names[j];
    					names[j] = temp;
     			}
    	return names;
    	
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
        Scanner sc = new Scanner(System.in);
    	int n;
        System.out.print("Enter the number of students: ");
        n = sc.nextInt();
        Student students[] = new Student[n];
        for (int i = 0; i < n; i++) {
        	students[i] = new Student();
        	System.out.println("The student's initials are: " + students[i].extractInitials());
        	System.out.println("The student's name without whitespaces: "+ students[i].removeWhitespace());
        }
        
        String subStr = new String();
        System.out.print("Enter substring: ");
        subStr = sc.next();
        String[] subNames = substring(students, subStr);
        System.out.println("\nNames containing the substring: ");
        for (String name: subNames) {
        	if (name != null)
        		System.out.println(name);
        }
        
        String[] sortedNames = sort(students);
        System.out.println("\nThe sorted list of names: ");
        for (String name: sortedNames) {
        	if (name != null)
        		System.out.println(name);
        }

    
    	int[] marks = { 10, 11 };
        Student obj = new Student("Nived Mohan", marks);
        System.out.println(obj.extractInitials());
        System.out.println(obj.removeWhitespace());
      
    }
}