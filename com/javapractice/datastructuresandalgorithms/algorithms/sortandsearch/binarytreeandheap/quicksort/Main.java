package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarytreeandheap.quicksort;

import com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarytreeandheap._constant.InitialiseComponent;

import java.util.Arrays;

import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarytreeandheap.quicksort.Methods.quickSort;

public class Main {
    public static void main(String[] args) {
        String[] unsortedList = InitialiseComponent.unsortedStringList();

        System.out.println(Arrays.toString(unsortedList));
        quickSort(unsortedList, 0, unsortedList.length -1);
        System.out.println("\n" + Arrays.toString(unsortedList));
    }
}
