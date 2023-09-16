package IT_2YR_BLK2.Lanuza.ph.edu.sorsu.sorting.impl;

import IT_2YR_BLK2.Lanuza.ph.edu.sorsu.sorting.SortAlgorithm;

public class BubbleSortAlgorithm implements SortAlgorithm {

    @Override
    public void sort(int[] myArray) {
        System.out.println("Applying Bubble Sort Algorithm...");

        for (int i = myArray.length - 1; i > 0; i--) { // step 1
            for (int j = 0; j < i; j++) { // step 2
                if (myArray[j] > myArray[j + 1]) {
                    swap(myArray, j, j + 1); // step 3 swapping
                }
            }
        }
        // print the sorted array.
        System.out.println("Sorted array ...");
        for (int num : myArray) {
            System.out.printf("%s", num);
        }
        System.out.println();
    }

    private void swap(int[] myArray, int j, int i) {
        if (i == j) {
            return;
        }
        int temp = myArray[j];
        myArray[j] = myArray[i];
        myArray[i] = temp;
    }
}
