package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.shellsort;

import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.insertionsort.Methods.insertionSortIncremental;

public class Methods {
    public static void shellSort(int[] listToSort){
        int increment = listToSort.length / 2;
        while(increment >=1){
            insertionSortIncremental(listToSort, increment);
            increment = increment / 2;
        }
    }

    public static void shellSortKnuthsIntervals(int[] listToSort){
        int k = 1;
        int increment = (3 * k - 1) / 2;
        while(increment < listToSort.length){
            insertionSortIncremental(listToSort, increment);
            k++;
            increment = (3 * k - 1) / 2;
        }
    }
}
