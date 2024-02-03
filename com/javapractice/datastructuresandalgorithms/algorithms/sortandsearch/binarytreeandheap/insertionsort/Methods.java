package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarytreeandheap.insertionsort;

import java.util.Arrays;

import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarytreeandheap._constant.Methods.swap;

public class Methods {
    public static void insertionSort(int[] listToSort){
        insertionSortIncremental(listToSort, 1);
    }

    public static void insertionSortIncremental(int[] listToSort, int increment){
        for(int i = 0; i + increment < listToSort.length; i++){
            System.out.println("\ni = " + i + " increment = " + increment);
            for (int j = i + increment; j - increment >= 0; j = j - increment){
                if(listToSort[j] < listToSort[j - increment]){
                    swap(listToSort, j, j - increment);
                    System.out.print("Swapping: " + j + " and " + (j - increment) + " ");
                    System.out.println(Arrays.toString(listToSort));
                } else{
                    break;
                }
            }
        }
    }
}
