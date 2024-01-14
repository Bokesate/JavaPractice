package com.javapractice.datastructures;

import java.util.Queue;
import java.util.LinkedList;

import java.util.Stack;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Node<Character> a = new Node<>('A');
        Node<Character> b = new Node<>('B');
        Node<Character> c = new Node<>('C');
        Node<Character> d = new Node<>('D');
        Node<Character> e = new Node<>('E');
        Node<Character> f = new Node<>('F');
        Node<Character> g = new Node<>('G');
        Node<Character> h = new Node<>('H');

        a.setLeftChild(b);
        a.setRightChild(c);

        c.setLeftChild(d);
        c.setRightChild(e);

        d.setLeftChild(f);
        d.setRightChild(h);

        e.setRightChild(g);

        System.out.println("BreadthFirst Traversal");
        breadthFirst(a);
        System.out.println();
        System.out.println();

        System.out.println("DepthFirst InOrder Traversal");
        inOrderStack(a);
        System.out.println();
        System.out.println("DepthFirst InOrder Traversal Recursive");
        inOrderRecursive(a);
        System.out.println();
        System.out.println();

        System.out.println("DepthFirst PreOrder Traversal");
        preOrderStack(a);
        System.out.println();
        System.out.println("DepthFirst PreOrder Traversal Recursive");
        preOrderRecursive(a);
        System.out.println();
        System.out.println();

        System.out.println("DepthFirst PostOrder Traversal");
        postOrderStack(a);
        System.out.println();
        System.out.println("DepthFirst PostOrder Traversal Recursive");
        postOrderRecursive(a);
    }

    public static <T> void breadthFirst(Node<T> root){
        if (root == null){
            return;
        }

        Queue<Pair<Node<T>, Integer>> queue = new LinkedList<>();

        int level = 0;
        queue.add(new Pair<>(root, level));

        while (!queue.isEmpty()){
            Pair<Node<T>, Integer> pair = queue.remove();
            System.out.print(pair + "->");
            level = pair.getValue() + 1;

            Node<T> leftChild = pair.getKey().getLeftChild();
            if(leftChild != null){
                queue.add(new Pair<>(leftChild, level));
            }

            Node<T> rightChild = pair.getKey().getRightChild();
            if(rightChild != null){
                queue.add(new Pair<>(rightChild, level));
            }
        }
    }

    public static <T> void inOrderStack(Node<T> root){
        if(root == null){
            return;
        }

        Set<Node<T>> visitedNodes = new HashSet<>();
        Stack<Node<T>> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node<T> top = stack.pop();

            if(top.getLeftChild() == null && top.getRightChild() == null){
                System.out.print(top + "->");
            }else if(visitedNodes.contains(top)){
                System.out.print(top + "->");
            }else{
                visitedNodes.add(top);

                if(top.getRightChild() != null){
                    stack.push(top.getRightChild());
                }

                stack.push(top);

                if(top.getLeftChild() != null){
                    stack.push(top.getLeftChild());
                }
            }
        }
    }

    public static <T> void inOrderRecursive(Node<T> root){
        if(root == null){
            return;
        }

        inOrderRecursive(root.getLeftChild());

        System.out.print(root.getData() + "->");

        inOrderRecursive(root.getRightChild());

    }

    public static <T> void preOrderStack(Node<T> root) {
        if (root == null) {
            return;
        }

        Set<Node<T>> visitedNodes = new HashSet<>();
        Stack<Node<T>> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node<T> top = stack.pop();

            if(top.getLeftChild() == null && top.getRightChild() == null){
                System.out.print(top + "->");
            }else if(visitedNodes.contains(top)){
                System.out.print(top + "->");
            }else{
                visitedNodes.add(top);

                if(top.getRightChild() != null) {
                    stack.push(top.getRightChild());
                }

                if(top.getLeftChild() != null) {
                    stack.push(top.getLeftChild());
                }

                stack.push(top);
            }
        }
    }

    public static <T> void preOrderRecursive(Node<T> root){
        if(root == null){
            return;
        }

        System.out.print(root.getData() + "->");

        preOrderRecursive(root.getLeftChild());
        preOrderRecursive(root.getRightChild());
    }

    public static <T> void postOrderStack(Node<T> root) {
        if (root == null) {
            return;
        }

        Set<Node<T>> visitedNodes = new HashSet<>();
        Stack<Node<T>> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node<T> top = stack.pop();

            if(top.getLeftChild() == null && top.getRightChild() == null){
                System.out.print(top + "->");
            }else if(visitedNodes.contains(top)){
                System.out.print(top + "->");
            }else{
                visitedNodes.add(top);

                stack.push(top);

                if(top.getRightChild() != null) {
                    stack.push(top.getRightChild());
                }

                if(top.getLeftChild() != null) {
                    stack.push(top.getLeftChild());
                }
            }
        }
    }

    public static <T> void postOrderRecursive(Node<T> root){
        if(root == null){
            return;
        }

        postOrderRecursive(root.getLeftChild());
        postOrderRecursive(root.getRightChild());
        System.out.print(root.getData() + "->");
    }
}