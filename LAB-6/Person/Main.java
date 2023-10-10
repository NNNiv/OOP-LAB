import java.util.Scanner;

class Person {
  private String name;
  private String dob;

  void displayName() {
    System.out.println("Name: " + name);
  }

  void displayDOB() {
    System.out.println("Date of birth: " + dob);
  }

  Person() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name: ");
    name = sc.next();
    System.out.println("Enter D.O.B: ");
    dob = sc.next();
  }

  Person(String name, String dob) {
    this.name = name;
    this.dob = dob;
  }
}

class CollegeGraduate extends Person {
  private double gpa;
  private int yearOfGrad;

  CollegeGraduate() {
    super();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter GPA: ");
    gpa = sc.nextDouble();
    System.out.println("Enter Year of Graduation: ");
    yearOfGrad = sc.nextInt();
  }

  CollegeGraduate(int gpa, int yearOfGrad) {
    this.gpa = gpa;
    this.yearOfGrad = yearOfGrad;
  }

  void displayGPA() {
    System.out.println("GPA: " + gpa);
  }

  void displayYear() {
    System.out.println("Year of Graduation: " + yearOfGrad);
  }
}

public class Main {
  public static void main(String[] args) {
    Person man1 = new Person();
    System.out.println();
    CollegeGraduate man2 = new CollegeGraduate();

    System.out.println("Display the Person class: ");
    man1.displayName();
    man1.displayDOB();
    System.out.println();

    System.out.println("Display the College Graduate class: ");
    man2.displayName();
    man2.displayDOB();
    man2.displayGPA();
    man2.displayYear();
  }
}
