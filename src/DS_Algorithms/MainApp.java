package DS_Algorithms;

import java.util.Random;

public class MainApp {
    public static void main(String[] args){

        MergeSort mergeSort=new MergeSort();
        BubbleSort bubbleSort=new BubbleSort();
        InsertionSort insertionSort= new InsertionSort();
        SelectionSort selectionSort=new SelectionSort();
        QuickSort quickSort=new QuickSort();
        BinarySearch binarySearch=new BinarySearch();

        int[] arr=new int[10];


        makeRandom(arr);
        System.out.print("Unsorted array:");
        display(arr);


        System.out.print("(Merge sort)Sorted array:");
        mergeSort.mergesort(arr);
        display(arr);


        makeRandom(arr);
        System.out.print("Unsorted array:");
        display(arr);


        System.out.print("(Bubble sort)Sorted array:");
        bubbleSort.sort(arr);
        display(arr);


        makeRandom(arr);
        System.out.print("Unsorted array:");
        display(arr);

        System.out.print("(Insertion sort)Sorted array:");
        insertionSort.sort(arr);
        display(arr);


        makeRandom(arr);
        System.out.print("Unsorted array:");
        display(arr);

        System.out.print("(Selection sort)Sorted array:");
        selectionSort.sort(arr);
        display(arr);


        makeRandom(arr);
        System.out.print("Unsorted array:");
        display(arr);

        System.out.print("(Quick sort)Sorted array:");
        quickSort.sort(arr);
        display(arr);


        System.out.println("Contains [5]: "+binarySearch.search(5,arr));



        // To do:
        // implement time complexity
        // add more algorithms to the collection
        // implement optimization


    }

    public static void makeRandom(int []arr){
        Random rand = new Random();
        for (int i = 0; i <arr.length ; i++) {

            arr[i]=  rand.nextInt(10)+1;
        }

    }


    public  static String toString(int arr[]) {
        String arrayAsString ="";
        for (int i = 0; i < arr.length; i++) {
            arrayAsString +="["+ String.valueOf(arr[i])+"]->";
        }
        System.out.println();
        return arrayAsString;
    }
    public  static void display(int arr[]){
        System.out.println(toString(arr));
    }


}
