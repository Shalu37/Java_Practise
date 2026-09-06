public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return; // base case: 0 or 1 element, already "sorted"
        }

        int mid = left + (right - left) / 2; // avoids overflow vs (left+right)/2

        mergeSort(arr, left, mid);       // sort left half
        mergeSort(arr, mid + 1, right);  // sort right half

        merge(arr, left, mid, right);    // merge the two sorted halves
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;   // size of left subarray
        int n2 = right - mid;      // size of right subarray

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0;      // pointers for leftArr, rightArr
        int k = left;          // pointer for arr (where we write back)

        // Compare front of both arrays, place the smaller one into arr
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy any leftover elements (one side will still have some)
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 1, 9, 2};
        System.out.println("Before: " + java.util.Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After:  " + java.util.Arrays.toString(arr));
    }
}