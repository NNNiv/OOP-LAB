import java.util.Scanner;

public class ReverseInt {
    public static void main(String args[]) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n = sc.nextInt();

        System.out.println("The reversed number is: " + reverse(n));

        if (reverse(n) == n) {
            System.out.println(n + " is a Palindrome");
        }
        else {
            System.out.println(n + " is not a Palindrome");
        }

    }
    public static int reverse(int n) {
        
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        return rev;
    }
    
}
