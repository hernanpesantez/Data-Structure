package DS_Algorithms;


public class MergeSort {


    public MergeSort(){ }

    private static int[] aux; // Used for merging
    public static void mergesort(int[] a) {
        aux = new int[a.length];
        mergesort(a, 0, a.length-1);
    }

    private static void mergesort(int[] a, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergesort(a, low, mid);      // Sort the left half
        mergesort(a, mid+1, high);   // Sort the right half
        merge(a, low, mid, high);    // Merge the two halves
    }

    // Merges a[low...mid] with a[mid+1...high].
    private static void merge(int[] a, int low, int mid, int high) {
        for (int k = low; k <= high; ++k)                       // Copy the array
            aux[k] = a[k];
        for (int i = low, j = mid+1, k = low; k <= high; ++k) { // Merge back into the original array
            if (i > mid) a[k] = aux[j++];
            else if (j > high) a[k] = aux[i++];
            else if (aux[i] < aux[j]) a[k] = aux[i++];
            else a[k] = aux[j++];
        }
    }



}
