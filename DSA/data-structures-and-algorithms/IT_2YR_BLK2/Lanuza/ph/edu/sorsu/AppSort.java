/*
 ACTIVITY 8 and 9: Algorithm
 Submitted by: Rovic Angelo Lanuza
 Course/Year/Block: BSIT 2-2
 */
package IT_2YR_BLK2.Lanuza.ph.edu.sorsu;

import IT_2YR_BLK2.Lanuza.ph.edu.sorsu.sorting.impl.BubbleSortAlgorithm;
import IT_2YR_BLK2.Lanuza.ph.edu.sorsu.sorting.impl.InsertionSortAlgorithm;
import IT_2YR_BLK2.Lanuza.ph.edu.sorsu.sorting.impl.SelectionSortAlgorithm;

public class AppSort {
    public static void main(String[] args) {
        // unsorted array
        int[] myArray = { 11, 35, 29, 18, 36, 5, 24, 31, 16, 39, 21, 26, 1, 15, 9, 3, 6, 20, 37, 25, 27, 32, 13, 4, 8,
                19, 22, 12, 40,
                2, 33, 10, 28,
                14, 23, 17, 34, 7, 30, 38 };

        // print the unsorted array
        System.out.println("unsorted Array ...");

        for (int num : myArray) {
            System.out.printf("%s", num);
        }
        System.out.println();
        System.out.println();
        // bubble sort
        long bubbleSortStartTime = System.nanoTime();
        BubbleSortAlgorithm(myArray);
        long bubbleSortEndTime = System.nanoTime();
        System.out.println(
                "Bubble Sort Time Execution is " + (bubbleSortEndTime - bubbleSortStartTime) + " nanoseconds.");
        System.out.println();

        // selection sort
        long selectionSortStartTime = System.nanoTime();
        SelectionSortAlgorithm(myArray);
        long selectionSortEndTime = System.nanoTime();
        System.out.println("Selection Sort Time Execution is " + (selectionSortEndTime - selectionSortStartTime)
                + " nanoseconds.");
        System.out.println();

        // insertion sort
        long insertionSortStartTime = System.nanoTime();
        InsertionSortAlgorithm(myArray);
        long insertionSortEndTime = System.nanoTime();
        System.out.println("insertion Sort Time Execution is " + (insertionSortEndTime - insertionSortStartTime)
                + " nanoseconds.");
        System.out.println();

        // merge sort
        long mergeSortStartTime = System.nanoTime();
        System.out.println("Applying Merge Sort Algorithm ...");
        MergeSortAlgorithm(myArray, 0, myArray.length);
        System.out.println("Sorted Array ...");

        for (int num : myArray) {
            System.out.printf("%s", num);
        }
        System.out.println();

        long mergeSortEndTime = System.nanoTime();
        System.out.println("Merge Sort Time Execution is " + (mergeSortEndTime - mergeSortStartTime) + " nanoseconds.");
        System.out.println();
    }

    private static void BubbleSortAlgorithm(int[] myArray) {
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        bubbleSortAlgorithm.sort(myArray);
    }

    private static void InsertionSortAlgorithm(int[] myArray) {
        InsertionSortAlgorithm insertionSortAlgorithm = new InsertionSortAlgorithm();
        insertionSortAlgorithm.sort(myArray);
    }

    private static void MergeSortAlgorithm(int[] myArray, int i, int length) {
    }

    private static void SelectionSortAlgorithm(int[] myArray) {
        SelectionSortAlgorithm selectionSortAlgorithm = new SelectionSortAlgorithm();
        selectionSortAlgorithm.sort(myArray);
    }
}
