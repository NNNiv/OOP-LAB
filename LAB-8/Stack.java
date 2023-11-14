import java.util.Scanner;

class PushException extends Exception {
    public PushException(String message) {
        super(message);
    }
}

class PopException extends Exception {
    public PopException(String message) {
        super(message);
    }
}

public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) throws PushException {
        if (top == maxSize - 1) {
            throw new PushException("Stack is full. Cannot push element: " + value);
        }
        stackArray[++top] = value;
    }

    public int pop() throws PopException {
        if (top == -1) {
            throw new PopException("Stack is empty. Cannot pop element.");
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int stackSize = sc.nextInt();

        Stack stack = new Stack(stackSize);

        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter the element to push: ");
                        int element = sc.nextInt();
                        stack.push(element);
                        System.out.println("Element " + element + " pushed onto the stack.");
                        break;

                    case 2:
                        int poppedElement = stack.pop();
                        System.out.println("Popped: " + poppedElement);
                        break;

                    case 3:
                        System.out.println("Exiting the program.");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                        break;
                }
            } catch (PushException | PopException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }
}
