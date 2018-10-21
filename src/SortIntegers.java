import java.util.Arrays;
import java.util.Scanner;

public class SortIntegers {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int capacity) {
        int[] inputArray = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\n");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int temp;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] < sortedArray[j]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }

}
