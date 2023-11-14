import java.util.ArrayList;
import java.util.List;

class Student {
    public String name;
    public int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

}

class Employee {
    public String name;
    public int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

}

public class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        this.stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
        System.out.println("Pushed element to the stack");
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Example with Student objects
        GenericStack<Student> studentStack = new GenericStack<>();
        studentStack.push(new Student("Nived", 12345));
        studentStack.push(new Student("Rishil", 67890));

        System.out.println("Popped from Student Stack: " + (studentStack.pop()).name);

        System.out.println();

        // Example with Employee objects
        GenericStack<Employee> employeeStack = new GenericStack<>();
        employeeStack.push(new Employee("Rishabh", 101));
        employeeStack.push(new Employee("Gaurav", 202));

        System.out.println("Popped from Employee Stack: " + (employeeStack.pop()).name);
    }
}
