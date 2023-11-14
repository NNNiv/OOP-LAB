public class ArraySwap {

    public static <T> void exchangeElements(T[] array, int index1, int index2) {
        // Check of Invalid indices
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid indices");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        System.out.println("Original Integer Array: ");
        for (Integer num : intArray)
            System.out.print(num + " ");

        System.out.println();
        exchangeElements(intArray, 1, 3);
        System.out.println("After swapping: ");
        for (Integer num : intArray)
            System.out.print(num + " ");

        System.out.println();
        String[] strArray = { "apple", "banana", "cherry", "date" };
        System.out.println("\nOriginal String Array: ");
        for (String str : strArray)
            System.out.print(str + " ");

        System.out.println();
        exchangeElements(strArray, 0, 2);
        System.out.println("After swapping: ");
        for (String str : strArray)
            System.out.print(str + " ");
    }
}
