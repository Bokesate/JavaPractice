package com.javapractice.datastructureandalgorithms.algorithms.sortandsearch.selectionsort;

import com.javapractice.datastructureandalgorithms.algorithms.sortandsearch._constant.InitialiseComponent;

import java.util.Arrays;

import static com.javapractice.datastructureandalgorithms.algorithms.sortandsearch.selectionsort.Methods.selectionSort;

public class Main {
    public static void main(String[] args) {
        int[] unsortedList = InitialiseComponent.unsortedIntegerList();
        System.out.print(Arrays.toString(unsortedList));
        selectionSort(unsortedList);
    }
}
