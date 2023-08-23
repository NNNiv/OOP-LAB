import java.util.Scanner;

public class Stack {
    int arr[];
    int tos = -1;

    // Length of the stack
    Stack(int n) {
        arr = new int[n];
    }

    void push(int item) {
        if (tos >= arr.length - 1)
            System.out.println("Stack Overflow");
        else {
            arr[++tos] = item;
            System.out.println("Pushed " + item + " to the stack");
        }
    }

    void pop() {
        if (tos < 0)
            System.out.println("Stack Underflow");
        else {
            System.out.println("Popped " + arr[tos] + " from the stack");
            tos--;
        }
    }

    void display() {
        System.out.println("The elements of the stack are: ");
        for (int i = tos; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int n;
        int choice;
        int item;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the stack: ");
        n = sc.nextInt();
        Stack stk = new Stack(n);
        System.out.println("Stack of length " + n + " created");

        while (true) {
            System.out.println("Which operation would you like to perform: ");
            System.out.println("1. Push\n2. Pop\n3. Display");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter item to push: ");
                    item = sc.nextInt();
                    stk.push(item);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.display();
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
        }
        // sc.close();
    }
}
