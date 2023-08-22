import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int n;
		int element;
		int start, end;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements (max 10): ");
		n = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			element = sc.nextInt();
			arr[i] = element;
		}

		sc.close();

		for (int i = 0; i < n / 2; i++) {
			
			end = arr[n - i - 1]; 
			start = arr[i];
			arr[n - i - 1] = start;
			arr[i] = end;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
