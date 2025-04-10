

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 3};

        // Call the bubble sort method
        bubbleSort(numbers);

        // Print the sorted arrayṣ
        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(Arrays.toString(numbers));
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}