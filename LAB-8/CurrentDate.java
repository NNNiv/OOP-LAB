import java.util.Scanner;

class InvalidDayException extends Exception {
    public InvalidDayException(String message) {
        super(message);
    }
}

class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}

public class CurrentDate {
    private int day;
    private int month;
    private int year;

    public void createDate() throws InvalidDayException, InvalidMonthException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        day = sc.nextInt();

        if (day < 1 || day > 31) {
            throw new InvalidDayException("Invalid day. Please enter a day between 1 and 31.");
        }

        System.out.print("Enter month: ");
        month = sc.nextInt();

        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month. Please enter a month between 1 and 12.");
        }

        System.out.print("Enter year: ");
        year = sc.nextInt();

        if (year < 0) {
            throw new IllegalArgumentException("Invalid year. Please enter a positive year.");
        }
    }

    public void displayCurrentDate() {
        System.out.println("Current Date: " + day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
        CurrentDate currentDate = new CurrentDate();

        try {
            currentDate.createDate();
            currentDate.displayCurrentDate();
        } catch (InvalidDayException | InvalidMonthException | IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
