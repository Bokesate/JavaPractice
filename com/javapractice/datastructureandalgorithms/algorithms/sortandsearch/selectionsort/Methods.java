package com.javapractice.datastructureandalgorithms.algorithms.sortandsearch.selectionsort;

import java.util.Arrays;

import static com.javapractice.datastructureandalgorithms.algorithms.sortandsearch._constant.Methods.swap;

public class Methods {
    public static void selectionSort(int[] listToSort){
        for (int i = 0; i < listToSort.length; i++){
            System.out.println("\ni = " + i);
            for(int j = i + 1; j < listToSort.length; j++){
                if(listToSort[i] > listToSort[j]){
                    swap(listToSort, i, j);
                    System.out.print("Swapping: " + i + " and " + j + " ");
                    System.out.println(Arrays.toString(listToSort));
                }
            }
        }
    }
}
