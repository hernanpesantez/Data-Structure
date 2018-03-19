package DS_Algorithms;

public class InsertionSort {

    public InsertionSort() {
    }

    // Function to sort an array using insertion sort
    void sort(int arr[]) {
        int n = arr.length;
        int i, key, j;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

       /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}