import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int n;
		int start, end;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements (max 10): ");
		n = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		for (int i = 0; i < n / 2; i++) {
			
			end = arr[n - i - 1]; 
			start = arr[i];
			arr[n - i - 1] = start;
			arr[i] = end;
		}
		System.out.println("The reversed array is: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
