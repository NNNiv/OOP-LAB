package myPackages.p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int a, b, c;
    	Scanner sc = new Scanner(System.in);

    	System.out.println("Enter three integers: ");
    	a = sc.nextInt();
    	b = sc.nextInt();
    	c = sc.nextInt();
    	
        System.out.println("Maximum of three integers: " + Maximum.max(a, b, c));
        
        float d, e, f;

        System.out.println("Enter three floating point numbers: ");
        d = sc.nextFloat();
        e = sc.nextFloat();
        f = sc.nextFloat();

        System.out.println("Maximum of three floats: " + Maximum.max(d, e, f));

        int[] array = new int[10];
        int n;
        System.out.println("Enter the length of the array (max 10): ");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
        	array[i] = sc.nextInt();
        }
        System.out.println("Maximum in the array: " + Maximum.max(array));

        int[][] matrix = new int[3][3];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		System.out.print("Enter [" + i + "][" + j + "]: ");
        		matrix[i][j] = sc.nextInt();
        	}
        }
        System.out.println("Maximum in the matrix: " + Maximum.max(matrix));
    }
}
