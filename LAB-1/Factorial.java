import java.util.Scanner;

public class Factorial {
    
    public static void main(String args[]) {
        
        int n, r;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        n = sc.nextInt();

        System.out.println("Enter r: ");
        r = sc.nextInt();

        System.out.println("The factorial of " + n + " is " + factorial(n));

        System.out.println("nCr: " + (factorial(n) / (factorial(r) * factorial(n - r))));
    }
    public static int factorial(int n) {
        
        int fact = 1;

        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }
}
