import java.util.Scanner;

interface Series {
    int getNext();

    void reset();

    void setStart(int startValue);
}

public class ByTwos implements Series {
    private int currentValue;

    public ByTwos() {
        currentValue = 0;
    }

    @Override
    public int getNext() {
        currentValue += 2;
        return currentValue;
    }

    @Override
    public void reset() {
        currentValue = 0;
    }

    @Override
    public void setStart(int startValue) {
        currentValue = startValue;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ByTwos byTwosSeries = new ByTwos();

        int choice;
        System.out.println("Choose an option:");
        System.out.println("1. Get Next");
        System.out.println("2. Reset");
        System.out.println("3. Set Start");
        System.out.println("4. Exit");

        while (true) {

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Next in series: " + byTwosSeries.getNext());
                    break;
                case 2:
                    byTwosSeries.reset();
                    System.out.println("Series reset.");
                    break;
                case 3:
                    System.out.print("Enter the new start value: ");
                    int newStartValue = sc.nextInt();
                    byTwosSeries.setStart(newStartValue);
                    System.out.println("Start value set to: " + newStartValue);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
