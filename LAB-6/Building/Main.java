import java.util.Scanner;

class Building {
  double sqFeet;
  int stories;

  Building() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter area in sq. ft: ");
    sqFeet = sc.nextDouble();
    System.out.println("Enter number of stories: ");
    stories = sc.nextInt();
  }

  Building(double sqFeet, int stories) {
    this.sqFeet = sqFeet;
    this.stories = stories;
  }

  void display() {
    System.out.println("Area (sq. ft): " + sqFeet);
    System.out.println("Number of stories: " + stories);
  }
}

class House extends Building {
  int noBedRooms;
  int noBathRooms;

  House() {
    super();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of bed rooms: ");
    noBedRooms = sc.nextInt();
    System.out.println("Enter number of bath rooms: ");
    noBathRooms = sc.nextInt();
  }

  House(double sqFeet, int stories, int noBedRooms, int noBathRooms) {
    this.sqFeet = sqFeet;
    this.stories = stories;
    this.noBedRooms = noBedRooms;
    this.noBathRooms = noBathRooms;
  }

  void displayRooms() {
    System.out.println("Number of bed rooms: " + noBedRooms);
    System.out.println("Number of bath rooms: " + noBathRooms);
  }
}

class School extends Building {
  int noClassRooms;
  String gradeLevel; // Elementery, Junior High

  School() {
    super();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of class rooms: ");
    noClassRooms = sc.nextInt();
    System.out.println("Enter the grade level: ");
    gradeLevel = sc.next();
  }

  School(double sqFeet, int stories, int noClassRooms, String gradeLevel) {
    this.sqFeet = sqFeet;
    this.stories = stories;
    this.noClassRooms = noClassRooms;
    this.gradeLevel = gradeLevel;
  }

  void displayRooms() {
    System.out.println("Number of class rooms: " + noClassRooms);
    System.out.println("Grade level: " + gradeLevel);
  }
}

public class Main {
  public static void main(String args[]) {
    System.out.println("Demonstrating Building class: ");
    Building obj1 = new Building();
    obj1.display();
    System.out.println();

    System.out.println("Demonstrating House class: ");
    House obj2 = new House();
    obj2.display();
    obj2.displayRooms();
    System.out.println();

    System.out.println("Demonstrating School class: ");
    School obj3 = new School();
    obj3.display();
    obj3.displayRooms();
  }
}
