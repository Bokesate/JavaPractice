package com.javapractice.datastructuresandalgorithms.datastructures.binaryheap;

public class MinHeap <T extends Comparable<T>> extends Heap<T> {
    public MinHeap(Class<T> clazz) {
        super(clazz);
    }

    @Override
    protected void siftDown(int index) {
        System.out.println("Sifting down: " + getElementAtIndex(index));

        int leftIndex = getLeftChildIndex(index);
        int rightIndex = getRightChildIndex(index);

        //Note: find the smallest of the left and right child element
        int smallerIndex = -1;

        if (leftIndex != -1 && rightIndex != -1) {
            T leftElement = getElementAtIndex(leftIndex);
            T rightElement = getElementAtIndex(rightIndex);

            smallerIndex = leftElement.compareTo(rightElement) < 0 ? leftIndex : rightIndex;
        } else if (leftIndex != -1) {
            smallerIndex = leftIndex;
        } else if (rightIndex != -1) {
            smallerIndex = rightIndex;
        }

        // Note: if the left and right child do not exist stop sifting down.
        if (smallerIndex == -1) {
            System.out.println("Stop sifting down, found position");

            return;
        }

        System.out.println("Smaller child: " + getElementAtIndex(smallerIndex));

        //Note: compare the smaller child with the current index to see if a swap and further sift down is needed.
        if (getElementAtIndex(smallerIndex).compareTo(getElementAtIndex(index)) < 0) {
            swap(smallerIndex, index);
            System.out.println("Swap: " + this);
            siftDown(smallerIndex);
        }
    }

    @Override
    protected void siftUp(int index) {
        System.out.println("Sifting up: " + getElementAtIndex(index));
        int parentIndex = getParentIndex(index);

        if (parentIndex == -1) {
            System.out.println("Stop sifting up, found position");
            return;
        }

        System.out.println("Parent: " + getElementAtIndex(parentIndex));
        if (getElementAtIndex(index).compareTo(getElementAtIndex(parentIndex)) < 0) {
            swap(parentIndex, index);
            System.out.println(("Swap: " + this));
            siftUp(parentIndex);
        }
    }
}
