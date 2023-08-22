import java.util.Scanner;

public class PrimeArray {
	
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int j = 2; j <= Math.sqrt(n); j++) {
			if (n % j == 0) {
				return false;
			}
		}
		return true;
		};

	public static void main(String[] args) {		
		int[] arr = new int[10];
		int n;
		int element;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements (max 10): ");
		n = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			element = sc.nextInt();
			arr[i] = element;
		}
		sc.close();

		System.out.println("The prime elements are: ");
		for (int i = 0; i < n; i++) {
			
			// Print the prime elements
			if (isPrime(arr[i])) {
				System.out.println(arr[i]);
			}
		}
		
	}
}