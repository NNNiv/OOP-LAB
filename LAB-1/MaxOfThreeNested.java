import java.util.Scanner;

public class MaxOfThreeNested {
    
    public static void main(String args[]) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers below: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        System.out.println("The largest of three numbers is " + max(x, y, z));
        sc.close();
    }

    public static int max(int x, int y, int z) {
        if (x > y) {
            if (x > z) {
                return x;
            } else {
                return z;
            }
        } else {
            if (y > z) {
                return y;
            } else {
                return z;
            }
        }
    }
}
