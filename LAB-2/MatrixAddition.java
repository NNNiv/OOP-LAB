import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		int[][] matOne = new int[5][5];
		int[][] matTwo = new int[5][5];
		int[][] matResult = new int[5][5];

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of the matrix (n): ");
		n = sc.nextInt();
		
		System.out.println("Enter the elements of first matrix: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matOne[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of second matrix: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matTwo[i][j] = sc.nextInt();
			}
		}
		sc.close();
		// Add the corresponding elements
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matResult[i][j] = matOne[i][j] + matTwo[i][j];
			}
		}
		
		System.out.println("The resultant matrix is: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matResult[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}
