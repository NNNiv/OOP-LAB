import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		
		// Create an array of max size 20
		int[] arr = new int[20];
		
		int n;
		System.out.println("Enter the value of n (max 20): ");
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		System.out.println("Entered values from 1 to " + n + " in the array");
		
		for(int number: arr) {
			if (number == 0) {
				break;
			} else {
			System.out.print(number + " " );
			}
		}
		
	}

}
