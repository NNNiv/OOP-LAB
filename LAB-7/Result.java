import java.util.Scanner;

interface Sports {
    void putGrade();
}

class Student {
    private int rollNo;
    private float marks;

    void getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
    }

    void putNumber() {
        System.out.println("Roll No: " + rollNo);
    }

    void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        marks = sc.nextFloat();
    }

    void putMarks() {
        System.out.println("Marks: " + marks);
    }
}

class Result extends Student implements Sports {
    @Override
    public void putGrade() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sports Grade: ");
        String sportsGrade = sc.nextLine();
        System.out.println("Sports Grade: " + sportsGrade);
    }

    void generateResult() {
        getNumber();
        getMarks();
        putNumber();
        putMarks();
        putGrade();
    }

    public static void main(String[] args) {
        Result Obj = new Result();
        Obj.generateResult();
    }
}
