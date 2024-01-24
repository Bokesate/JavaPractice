package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.bubblesort;

import com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch._constant.InitialiseComponent;

import java.util.Arrays;

import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.bubblesort.Methods.bubbleSort;
import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.bubblesort.Methods.bubbleSortStopEarly;

public class Main {
    public static void main(String[] args) {
        int[] unsortedList = InitialiseComponent.unsortedIntegerList();
        System.out.println(Arrays.toString(unsortedList));
        bubbleSort(unsortedList);

        System.out.println(" New sort ");

        System.out.println(Arrays.toString(unsortedList));
        bubbleSortStopEarly(unsortedList);
    }
}
