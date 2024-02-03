package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarytreeandheap.bubblesort;

import java.util.Arrays;

import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarytreeandheap._constant.Methods.swap;
public class Methods {
    public static void bubbleSort(int[] listToSort){
        for(int i = listToSort.length - 1; i > 0 ;i--){
            System.out.println("\ni = " + i);
            for (int j = 0 ; j < i; j++){
                if(listToSort[j] > listToSort[j + 1]){
                    swap(listToSort, j, j + 1);
                    System.out.print("Swapping: " + j + " and " + (j + 1) + " ");
                    System.out.println(Arrays.toString(listToSort));
                }
            }
        }
    }

    public static void bubbleSortStopEarly(int[] listToSort){
        for(int i = listToSort.length - 1; i > 0 ;i--){
            boolean swapped = false;
            System.out.println("\ni = " + i);
            for (int j = 0 ; j < i; j++){
                if(listToSort[j] > listToSort[j + 1]){
                    swap(listToSort, j, j + 1);
                    swapped = true;
                    System.out.print("Swapping: " + j + " and " + (j + 1) + " ");
                    System.out.println(Arrays.toString(listToSort));
                }
            }

            if(!swapped){
                break;
            }
        }
    }
}
