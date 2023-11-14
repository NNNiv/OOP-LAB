import java.util.Scanner;

class RowSumCalculator implements Runnable {
    private int[] row;
    private int partialSum;

    public RowSumCalculator(int[] row) {
        this.row = row;
        this.partialSum = 0;
    }

    public int getPartialSum() {
        return partialSum;
    }

    @Override
    public void run() {
        for (int num : row) {
            partialSum += num;
        }
    }
}

public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }

        int numRows = matrix.length;
        RowSumCalculator[] rowCalculators = new RowSumCalculator[numRows];
        Thread[] threads = new Thread[numRows];

        // Create and start threads
        for (int i = 0; i < numRows; i++) {
            rowCalculators[i] = new RowSumCalculator(matrix[i]);
            threads[i] = new Thread(rowCalculators[i]);
            threads[i].start();
        }

        // Wait for all threads to complete
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Calculate the total sum by summing up the partial sums
        int totalSum = 0;
        for (RowSumCalculator calculator : rowCalculators) {
            totalSum += calculator.getPartialSum();
        }

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("\nTotal Sum: " + totalSum);
    }
}
