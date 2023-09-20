import java.util.Scanner;

public class Comma {
    public static String convertToCommaSeparated(String input) {
        int len = input.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < len; i++) {
            result.append(input.charAt(i));
            if ((len - i - 1) % 3 == 0 && i != len - 1) {
                result.append(',');
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        scanner.close();

        String output = convertToCommaSeparated(input);
        System.out.println("Input number: " + input);
        System.out.println("Output number: " + output);
    }
}
