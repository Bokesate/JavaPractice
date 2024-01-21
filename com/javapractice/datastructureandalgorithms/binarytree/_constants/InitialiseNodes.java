package com.javapractice.datastructureandalgorithms.binarytree._constants;

public class InitialiseNodes {
    public static Node<Integer> initialiseNumberNodes(){

        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(3);
        Node<Integer> four = new Node<>(4);
        Node<Integer> five = new Node<>(5);
        Node<Integer> six = new Node<>(6);
        Node<Integer> seven = new Node<>(7);
        Node<Integer> eight = new Node<>(8);

        one.setLeftChild(two);
        one.setRightChild(three);

        three.setLeftChild(seven);
        three.setRightChild(six);

        seven.setLeftChild(eight);

        six.setLeftChild(five);
        six.setRightChild(four);

        return one;
    }

    public static Node<?> initialiseNodes(){

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

        return a;
    }

    public static Node<?> initialiseFullBinaryTreeNodes(){

        Node<Character> a = new Node<>('A');
        Node<Character> b = new Node<>('B');
        Node<Character> c = new Node<>('C');
        Node<Character> d = new Node<>('D');
        Node<Character> e = new Node<>('E');
        Node<Character> f = new Node<>('F');
//        Node<Character> g = new Node<>('G');
        Node<Character> h = new Node<>('H');
        Node<Character> i = new Node<>('I');
        Node<Character> j = new Node<>('J');

        a.setLeftChild(b);
        a.setRightChild(c);

        c.setLeftChild(d);
        c.setRightChild(e);

        d.setLeftChild(f);
        d.setRightChild(h);

        b.setLeftChild(i);
        b.setRightChild(j);

        return a;
    }

    public static Node<?> initialisePerfectBinaryTreeNodes(){

        Node<Character> a = new Node<>('A');
        Node<Character> b = new Node<>('B');
        Node<Character> c = new Node<>('C');
//        Node<Character> d = new Node<>('D');
        Node<Character> e = new Node<>('E');
        Node<Character> f = new Node<>('F');
        Node<Character> g = new Node<>('G');
        Node<Character> h = new Node<>('H');

        a.setLeftChild(b);
        a.setRightChild(c);

        b.setLeftChild(g);
        b.setRightChild(h);

        c.setLeftChild(e);
        c.setRightChild(f);

        return a;
    }

    public static Node<?> initialiseCompleteBinaryTreeNodes(){

        Node<Character> a = new Node<>('A');
        Node<Character> b = new Node<>('B');
        Node<Character> c = new Node<>('C');
        Node<Character> d = new Node<>('D');
        Node<Character> e = new Node<>('E');
        Node<Character> f = new Node<>('F');
        Node<Character> g = new Node<>('G');
        Node<Character> h = new Node<>('H');
        Node<Character> i = new Node<>('I');

        a.setLeftChild(b);
        a.setRightChild(c);

        b.setLeftChild(f);
        b.setRightChild(g);

        c.setLeftChild(d);
        c.setRightChild(e);

        f.setLeftChild(h);
        f.setRightChild(i);

        return a;
    }

}
