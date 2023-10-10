import java.util.Scanner;

abstract class Figure {
  int length;
  int width;

  abstract void area();
}

class Rectangle extends Figure {
  Rectangle() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length: ");
    length = sc.nextInt();
    System.out.println("Enter width: ");
    width = sc.nextInt();
  }

  void area() {
    System.out.println("Area of rectangle: " + length * width);
  }

}

class Square extends Figure {

  Square() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter side length: ");
    length = sc.nextInt();
  }

  void area() {
    System.out.println("Area of square: " + length * length);
  }
}

class Triangle extends Figure {

  Triangle() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter base: ");
    length = sc.nextInt();
    System.out.println("Enter height: ");
    width = sc.nextInt();
  }

  void area() {
    System.out.println("Area of triangle: " + (0.5 * length * width));
  }
}

public class Main {
  public static void main(String args[]) {
    Figure ref;
    Rectangle rec = new Rectangle();
    Square sq = new Square();
    Triangle tri = new Triangle();

    // Dynamic polymorphism
    ref = rec;
    ref.area();

    ref = sq;
    ref.area();

    ref = tri;
    ref.area();
  }
}
