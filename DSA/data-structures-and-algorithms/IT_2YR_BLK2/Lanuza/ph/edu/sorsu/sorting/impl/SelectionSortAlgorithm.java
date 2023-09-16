package IT_2YR_BLK2.Lanuza.ph.edu.sorsu.sorting.impl;

import IT_2YR_BLK2.Lanuza.ph.edu.sorsu.sorting.SortAlgorithm;

public class SelectionSortAlgorithm implements SortAlgorithm {

    @Override
    public void sort(int[] myArray) {
        System.out.println("Applying Selection Sort Algorithm ...");
        for (int i = myArray.length - 1; i > 0; i--) {
            int m = 0;
            for (int j = 1; j <= i; j++) {
                if (myArray[j] > myArray[m]) {
                    m = j;
                }
            }

            swap(myArray, i, m);
        }

        // print the sorted array
        System.out.println("Sorted Array ...");

        for (int num : myArray) {
            System.out.printf("%s", num);
        }
        System.out.println();
    }

    private void swap(int[] myArray, int i, int m) {

        int temp = myArray[m];
        myArray[m] = myArray[i];
        myArray[i] = temp;
    }
}
