package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.selectionsort;

import com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch._constant.InitialiseComponent;

import java.util.Arrays;

import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.selectionsort.Methods.selectionSort;

public class Main {
    public static void main(String[] args) {
        int[] unsortedList = InitialiseComponent.unsortedIntegerList();
        System.out.print(Arrays.toString(unsortedList));
        selectionSort(unsortedList);
    }
}
