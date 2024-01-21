package com.javapractice.datastructureandalgorithms.algorithms.sortandsearch._constant;

public class Methods {
    public static void swap(int[] list, int iIndex, int jIndex){
        int temp = list[iIndex];

        list[iIndex] = list[jIndex];
        list[jIndex] = temp;
    }

    public static void swap(String[] list, int iIndex, int jIndex){
        String temp = list[iIndex];

        list[iIndex] = list[jIndex];
        list[jIndex] = temp;
    }
}
