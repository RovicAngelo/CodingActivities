package IT_2YR_BLK2.Lanuza.ph.edu.sorsu.sorting.impl;

import IT_2YR_BLK2.Lanuza.ph.edu.sorsu.sorting.SortAlgorithm;

public class InsertionSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(int[] myArray) {

        System.out.println("Applying Insertion Sort Algorithm ...");
        for (int i = 1; i < myArray.length; i++) {
            int ia = myArray[i], j;
            for (j = i; j > 0 && myArray[j - 1] > ia; j--) {
                myArray[j] = myArray[j - 1];
            }
            myArray[j] = ia;
        }
        // print the sorted myArray
        System.out.println("Sorted Array ...");
        for (int num : myArray) {
            System.out.printf("%s", num);
        }
        System.out.println();
    }
}
