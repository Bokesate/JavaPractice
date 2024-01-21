package com.javapractice.datastructureandalgorithms.algorithms.sortandsearch.shellsort;

import com.javapractice.datastructureandalgorithms.algorithms.sortandsearch._constant.InitialiseComponent;

import java.util.Arrays;

import static com.javapractice.datastructureandalgorithms.algorithms.sortandsearch.shellsort.Methods.shellSortKnuthsIntervals;

public class Main {
    public static void main(String[] args) {
        int[] unsortedList = InitialiseComponent.unsortedIntegerList();
//        System.out.println(Arrays.toString(unsortedList));
//        shellSort(unsortedList);
//
//        System.out.println(" next sort ");

        System.out.println(Arrays.toString(unsortedList));
        shellSortKnuthsIntervals(unsortedList);

    }
}
