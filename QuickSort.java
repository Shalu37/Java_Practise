import java.util.Scanner;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return; // base case: 0 or 1 element, already sorted
        }

        int pivotIndex = partition(arr, low, high);

        quickSort(arr, low, pivotIndex - 1);   // sort left part
        quickSort(arr, pivotIndex + 1, high);  // sort right part
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choosing last element as pivot
        int i = low - 1;       // boundary of "smaller than pivot" zone

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high); // place pivot in its final position
        return i + 1;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before: " + java.util.Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After:  " + java.util.Arrays.toString(arr));

        sc.close();
    }
}