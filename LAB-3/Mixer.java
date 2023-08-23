import java.util.Scanner;

class Mixer {
    private int[] arr;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        arr = new int[n];
        
        System.out.println("Enter the elements in ascending order without duplicates:");
        arr[0] = sc.nextInt();
        
        int currentIndex = 1; // Start from the second element
        for (int i = 1; i < n; i++) {
            int num = sc.nextInt();
            if (num > arr[currentIndex - 1]) {
                arr[currentIndex] = num;
                currentIndex++;
            } else {
                System.out.println("Please enter a larger number.");
                i--; // Decrement i to re-enter the same input
            }
        }
    }

    Mixer mix(Mixer A) {
        Mixer result = new Mixer();
        int[] mergedArray = new int[this.arr.length + A.arr.length];
        int i = 0, j = 0, k = 0;

        while (i < this.arr.length && j < A.arr.length) {
            if (this.arr[i] < A.arr[j]) {
                mergedArray[k++] = this.arr[i++];
            } else if (this.arr[i] > A.arr[j]) {
                mergedArray[k++] = A.arr[j++];
            } else {
                mergedArray[k++] = this.arr[i++];
                j++;
            }
        }

        while (i < this.arr.length) {
            mergedArray[k++] = this.arr[i++];
        }

        while (j < A.arr.length) {
            mergedArray[k++] = A.arr[j++];
        }

        result.arr = mergedArray;
        return result;
    }

    void display() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Mixer mixer1 = new Mixer();
        Mixer mixer2 = new Mixer();

        System.out.println("Enter elements for the first array:");
        mixer1.accept();

        System.out.println("Enter elements for the second array");
        mixer2.accept();

        Mixer mergedMixer = mixer1.mix(mixer2);

        System.out.println("First array");
        mixer1.display();

        System.out.println("Second array");
        mixer2.display();

        System.out.println("Merged array:");
        mergedMixer.display();
    }
}
