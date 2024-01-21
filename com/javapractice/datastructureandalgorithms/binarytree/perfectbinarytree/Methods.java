package com.javapractice.datastructureandalgorithms.binarytree.perfectbinarytree;

import com.javapractice.datastructureandalgorithms.binarytree._constants.Node;

public class Methods {
    public static <T> int leftDepth(Node<T> root){
        int leftDepth = 0;
        Node<T> node = root;

        while (node != null){
            leftDepth++;
            node = node.getLeftChild();
        }

        return leftDepth - 1;
    }

    public static <T> boolean isPerfectRecursive(Node<T> root, int leftDepth, int currentLevel){
        if(root == null){
            return true;
        }

        if(root.getLeftChild() == null && root.getRightChild() == null){
            return currentLevel == leftDepth;
        }

        if(root.getLeftChild() == null || root.getRightChild() == null){
            return false;
        }

        return isPerfectRecursive(root.getLeftChild(), leftDepth, currentLevel + 1) &&
                isPerfectRecursive(root.getRightChild(), leftDepth, currentLevel + 1);
    }

    public static <T> boolean isPerfect(Node<T> root){
        int leftDepth = leftDepth(root);
        return isPerfectRecursive(root, leftDepth, 0);
    }
}
