import java.util.Scanner;

class Student {
  String name;
  int id;

  Student() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name: ");
    name = sc.next();
    System.out.println("Enter id: ");
    id = sc.nextInt();
  }

  void displayDetails() {
    System.out.println("Student name: " + name);
    System.out.println("Student id: " + id);
  }
}

class Sports extends Student {
  int sGrade;

  Sports() {
    super();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter sports grade: ");
    sGrade = sc.nextInt();
  }

  void display() {
    displayDetails();
    System.out.println("Sports grade: " + sGrade);
  }

}

class Exam extends Student {
  int eGrade;

  Exam() {
    super();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter exam grade: ");
    eGrade = sc.nextInt();
  }

  void display() {
    displayDetails();
    System.out.println("Exam grade: " + eGrade);
  }
}

// The question requires you to derive the class `Results` by extending both
// `Sports` and `Exams`.
// However, multiple inheritance is not possible (at least for classes).
// This is an alternate solution.
class Results extends Student {
  int sGrade;
  int eGrade;

  Results() {
    super();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter sports grade: ");
    sGrade = sc.nextInt();
    System.out.println("Enter exam grade: ");
    eGrade = sc.nextInt();
  }

  void display() {
    String result = "Sports Grade: " + sGrade + "\n" + "Exam Grade: " + eGrade;
    displayDetails();
    System.out.println(result);
  }
}

public class Main {
  public static void main(String args[]) {
    System.out.println("Demonstrating Student class: ");
    Student obj1 = new Student();
    obj1.displayDetails();
    System.out.println();

    System.out.println("Demonstrating Sports class: ");
    Sports obj2 = new Sports();
    obj2.display();
    System.out.println();

    System.out.println("Demonstrating Exam class: ");
    Exam obj3 = new Exam();
    obj3.display();
    System.out.println();

    System.out.println("Demonstrating Results class: ");
    Results obj4 = new Results();
    obj4.display();
  }
}
