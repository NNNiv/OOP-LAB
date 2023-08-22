import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int n;
		int temp;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements (max 10): ");
		n = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		for (int i = 0; i < n / 2; i++) {
			
			temp = arr[n - i - 1]; 
			arr[n - i - 1] = arr[i];
			arr[i] = temp;
		}
		System.out.println("The reversed array is: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
