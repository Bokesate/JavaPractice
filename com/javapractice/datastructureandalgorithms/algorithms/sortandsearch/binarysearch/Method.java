package com.javapractice.datastructureandalgorithms.algorithms.sortandsearch.binarysearch;

public class Method {
    public static int linearSearch(String[] list, String element) {
        System.out.print("\nSearching..." + element + ": ");
        for (int i = 0; i < list.length; i++){
            System.out.print(i + " ");

            if(list[i].equals((element))){
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(String[] list, String element){
        System.out.println("\nSearching..." + element + ": ");

        int low = 0;
        int high = list.length -1;

        while (low <= high){
            int mid = (low + high) / 2;

            System.out.println("Low: " + low + " High: " + high + " Mid: " + mid + " Mid element: " + list[mid] );

            if(list[mid].equals(element)){
                return mid;
            }
            else if (list[mid].compareTo(element) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return -1;

    }

    public static int binarySearchRecursive(String[] list, String element, int low, int high){
        if(low > high){
            return -1;
        }

        System.out.println("\nSearching..." + element + ": ");

        while (low <= high){
            int mid = (low + high) / 2;

            System.out.println("Low: " + low + " High: " + high + " Mid: " + mid + " Mid element: " + list[mid] );

            if(list[mid].equals(element)){
                return mid;
            }
            else if (list[mid].compareTo(element) < 0) {
                return binarySearchRecursive(list, element, mid + 1, high);
            } else {
                return binarySearchRecursive(list, element, low, mid - 1);
            }

        }

        return -1;

    }

    public static int jumpSearch(String[] list, String element, int jumpLength){
        System.out.println("\nSearching..." + element + ": ");

        int i = 0;

        while(list[i].compareTo(element) <= 0){
            System.out.println("Element is greater than or equal to: " + list[i]);

            i = i + jumpLength;
            if(i >= list.length){
                break;
            }
        }

        int startIndex = i - jumpLength;
        int endIndex = Math.min(i, list.length);

        System.out.println("Looking between: " + startIndex + " and: " + endIndex);

        for(int j = startIndex; j < endIndex; j++){
            if ( list[j].equals(element)){
                return j;
            }
        }
        return -1;
    }

    public static int interpolationSearch(int[] list, int element){
        System.out.println("\nSearching..." + element + ": ");

        int low = 0;
        int high = list.length -1;

        while (low <= high){
            int mid = low + ((element - list[low]) * (high - low)) / (list[high] - list[low]);

            System.out.println("Low: " + low + " High: " + high + " Mid: " + mid + " Mid element: " + list[mid] );

            if(list[mid] == element){
                return mid;
            }
            else if (list[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return -1;

    }
}
